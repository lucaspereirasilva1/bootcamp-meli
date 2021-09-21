package br.com.meli.diploma.model.dto;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class DisciplinaDTO {

    private String nome;
    private BigDecimal nota;

}
