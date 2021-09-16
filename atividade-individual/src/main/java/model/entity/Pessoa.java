package model.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Pessoa {

    private final String nome;
    private final String endereco;
    private final String telefone;
    private final int idade;
    private final double altura;

    public Pessoa(String nome, String endereco, String telefone, int idade, double altura) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.altura = altura;
    }
}
