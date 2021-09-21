package br.com.meli.diploma.model.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Aluno {

    private Integer id;
    private String nome;
    private String endereco;
    private Integer idade;
    private List<Disciplina> listaDisciplinas;

}
