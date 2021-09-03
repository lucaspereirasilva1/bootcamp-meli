package com.example.demo.model.dto;

import com.example.demo.model.entity.Imovel;
import lombok.Data;

@Data
public class ImovelDTO {

    private String nome;
    private String endereco;
    private double tamanho;
    private int qtdQuartos;


//    public ImovelDto() {
//        Imovel imovel = new Imovel();
//        this.nome = imovel.getNome();
//        this.endereco = imovel.getEndereco();
//        this.tamanho = imovel.getTamanho();
//        this.qtdQuartos = imovel.getQtdQuartos();
//    }
}
