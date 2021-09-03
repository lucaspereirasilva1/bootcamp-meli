package com.example.demo.model.entity;

import lombok.Data;

@Data
public class Quarto {

    private String nome;
    private double largura;
    private double comprimento;

    public Quarto(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    //ImovelDto imovelDto;
}
