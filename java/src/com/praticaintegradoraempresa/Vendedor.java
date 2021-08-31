package com.praticaintegradoraempresa;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, int antiguidade, int salario, int comissao) {
        super(nome, antiguidade, salario);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public boolean calculePlus() {
        if ((super.getAntiguidade() > 5) && (this.comissao > 5000)) {
            super.setSalario(super.getSalario() + PLUS);
            return true;
        }
            return false;
    }

}
