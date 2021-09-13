package model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
public class Proprietario {

    private int cpf;
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String endereco;
    private long telefone;

}
