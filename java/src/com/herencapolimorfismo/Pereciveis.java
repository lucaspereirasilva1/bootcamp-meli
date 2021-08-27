package com.herencapolimorfismo;

public class Pereciveis extends Produto{

    private int diasParaCaducar;

    public Pereciveis(String nome, double price) {
        super(nome, price);
    }

    public Pereciveis(String nome, double price, int diasParaCaducar) {
        super(nome, price);
        this.diasParaCaducar = diasParaCaducar;
    }
    @Override
    public double calcule(int qtdProdutos) {
        double precofinal = super.getPrice() * qtdProdutos;
        double valorFinal;
        switch (this.diasParaCaducar) {
            case 3:
                valorFinal = precofinal/2;
                break;
            case 2:
                valorFinal = precofinal/3;
                break;
            case 1:
                valorFinal = precofinal/4;
                break;
            default:
                valorFinal = precofinal;
        }

        return valorFinal;

    }

    public int getDiasParaCaducar() {
        return diasParaCaducar;
    }

    public void setDiasParaCaducar(int diasParaCaducar) {
        this.diasParaCaducar = diasParaCaducar;
    }

}
