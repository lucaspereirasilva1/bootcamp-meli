package br.com.meli.diploma.model.service;

import br.com.meli.diploma.model.dto.AlunoDTO;
import br.com.meli.diploma.model.dto.DiplomaDTO;
import br.com.meli.diploma.model.entity.Aluno;
import br.com.meli.diploma.model.entity.Diploma;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class DiplomaService {

    @Autowired
    private AlunoService alunoService;
    private Integer id = 0;
    private final ModelMapper modelMapper = new ModelMapper();

    public DiplomaDTO gerar(String nome) {
        Optional<Aluno> alunoOptional = alunoService.getListaAluno().stream()
                .filter(a -> a.getNome().equals(nome))
                .findFirst();
        Aluno aluno = alunoOptional.orElse(null);
        BigDecimal media = alunoService.calcularMedia(aluno);
        String mensagem = "";
        if(media.compareTo(new BigDecimal("9.0")) >= 0) {
            mensagem = "Parabens";
        }
        Diploma diploma = new Diploma();
        diploma.comId(++id)
                .comMedia(media)
                .comMensagem(mensagem)
                .comAluno(aluno)
                .build();
        return converteDiplomaDTO(diploma);
    }

    public DiplomaDTO converteDiplomaDTO(Diploma diploma) {
        DiplomaDTO diplomaDTO = modelMapper.map(diploma, DiplomaDTO.class);
        diplomaDTO.setAlunoDTO(alunoService.converteAlunoDTO(diploma.getAluno()));
        return diplomaDTO;
    }
}
