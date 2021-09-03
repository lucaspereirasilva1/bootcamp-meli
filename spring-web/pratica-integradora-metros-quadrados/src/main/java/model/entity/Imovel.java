package model.entity;

import lombok.Data;

@Data
public class Imovel {

    private String nome;
    private String endereco;
    private double tamanho;
    private int qtdQuartos;

    public Imovel() {
        this.nome = "casa";
        this.endereco = "Rua da felicidade 317";
        this.tamanho = 40.0;
        this.qtdQuartos = 2;
    }
}
