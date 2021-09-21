package br.com.meli.diploma.model.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class Disciplina {

    private Integer id;
    private String nome;
    private BigDecimal nota;

}
