package com.escola;

public abstract class Pessoa {

    private String nome;
    private int id;


    public abstract void imprimirDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
