package br.com.meli.diploma.model.service;

import br.com.meli.diploma.model.dto.AlunoDTO;
import br.com.meli.diploma.model.entity.Aluno;
import br.com.meli.diploma.model.entity.Disciplina;
import lombok.Getter;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final ModelMapper modelMapper = new ModelMapper();
    private Integer idController = 0;
    @Autowired
    private DisciplinaService discisplinaService;
    @Getter
    private final List<Aluno> listaAluno = new ArrayList<>();

    public AlunoDTO cadastrar(AlunoDTO alunoDTO) {
        Aluno aluno = converteAluno(alunoDTO);
        aluno.setId(++idController);
        aluno.setListaDisciplinas(discisplinaService.criarListaDisciplinas(alunoDTO.getListaDisciplinas()));
        listaAluno.add(aluno);
        return alunoDTO;
    }

    public Aluno converteAluno(AlunoDTO alunoDTO) {
        return modelMapper.map(alunoDTO, Aluno.class);
    }

    public AlunoDTO converteAlunoDTO(Aluno aluno) {
        return modelMapper.map(aluno, AlunoDTO.class);
    }

    public List<AlunoDTO> retornarLista() {
        return listaConvertDTO(listaAluno);
    }

    public AlunoDTO buscarPorNome(String nome) {
        Optional<Aluno> optionalAluno = listaAluno.stream()
                .filter(a -> a.getNome().equals(nome))
                .findFirst();
        return converteAlunoDTO(optionalAluno.orElse(null));
    }

    public BigDecimal calcularMedia(Aluno aluno) {
        BigDecimal qtdMateria = BigDecimal.valueOf(aluno.getListaDisciplinas().size());
        BigDecimal somaNotas = new BigDecimal(0);
        for (Disciplina d: aluno.getListaDisciplinas()) {
            somaNotas = somaNotas.add(d.getNota());
        }
        return somaNotas.divide(qtdMateria, RoundingMode.valueOf(0));
    }

    public List<AlunoDTO> listaConvertDTO(List<Aluno> listaAluno) {
        Type listType = new TypeToken<List<AlunoDTO>>() {}.getType();
        return modelMapper.map(listaAluno, listType);
    }

    public boolean removerAluno(Integer id) {
        for (Aluno a: listaAluno) {
            if(a.getId().equals(id))
                return listaAluno.remove(a);
        }
        return false;
    }
}
