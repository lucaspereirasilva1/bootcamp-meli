package br.com.meli.diploma.model.dto;

import br.com.meli.diploma.model.entity.Disciplina;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AlunoDTO {

    private String nome;
    private String endereco;
    private Integer idade;
    private List<DisciplinaDTO> listaDisciplinas;

}
