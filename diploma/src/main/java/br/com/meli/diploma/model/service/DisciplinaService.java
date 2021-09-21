package br.com.meli.diploma.model.service;

import br.com.meli.diploma.model.dto.DisciplinaDTO;
import br.com.meli.diploma.model.entity.Disciplina;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Type;
import java.util.List;

@Service
public class DisciplinaService {

    private final ModelMapper modelMapper = new ModelMapper();

    public List<Disciplina> listaConvertDTO(List<DisciplinaDTO> listaDisciplinaDTO) {
        Type listType = new TypeToken<List<Disciplina>>() {}.getType();
        return modelMapper.map(listaDisciplinaDTO, listType);
    }

    public List<Disciplina> criarListaDisciplinas(List<DisciplinaDTO> listaDisciplinasDTO) {
        List<Disciplina> listaDisciplina = listaConvertDTO(listaDisciplinasDTO);
        listaDisciplina.forEach(
                d -> d.setId(listaDisciplina.indexOf(d) + 1));
        return listaDisciplina;
    }
}
