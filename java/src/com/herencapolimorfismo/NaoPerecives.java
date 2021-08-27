package com.herencapolimorfismo;

public class NaoPerecives extends Produto{

    private String tipo;

    public NaoPerecives(String nome, double price) {
        super(nome, price);
    }
    @Override
    public double calcule(int qtdProdutos) {
        return super.calcule(qtdProdutos);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
