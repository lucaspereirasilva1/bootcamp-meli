package br.com.meli.diploma.model.dto;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class DiplomaDTO {

    private AlunoDTO alunoDTO;
    private BigDecimal media;
    private String mensagem;

}
