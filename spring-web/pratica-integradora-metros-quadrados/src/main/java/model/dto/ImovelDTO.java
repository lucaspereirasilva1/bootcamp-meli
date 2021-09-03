package model.dto;

import lombok.Data;

@Data
public class ImovelDTO {

    private String nome;
    private String endereco;
    private double tamanho;

//    public ImovelDto() {
//        Imovel imovel = new Imovel();
//        this.nome = imovel.getNome();
//        this.endereco = imovel.getEndereco();
//        this.tamanho = imovel.getTamanho();
//        this.qtdQuartos = imovel.getQtdQuartos();
//    }
}
