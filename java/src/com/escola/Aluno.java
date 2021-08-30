package com.escola;

public class Aluno extends Pessoa{

    private String serie;

    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getId() + " - "  + serie);
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
