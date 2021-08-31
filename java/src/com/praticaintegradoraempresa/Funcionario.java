package com.praticaintegradoraempresa;

public class Funcionario {

    public static final int PLUS = 5000;

    private String nome;
    private int antiguidade;
    private double salario;

    public Funcionario(final String nome, int antiguidade, double salario) {
        this.nome = nome;
        this.antiguidade = antiguidade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
