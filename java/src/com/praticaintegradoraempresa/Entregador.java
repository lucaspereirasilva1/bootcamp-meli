package com.praticaintegradoraempresa;

public class Entregador extends Funcionario{

    private int zona;

    public Entregador(String nome, int antiguidade, int salario, int zona) {
        super(nome, antiguidade, salario);
        this.zona = zona;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public boolean calculePlus() {
        double salarioAumentado = 0;
        if ((super.getAntiguidade() > 3) && (this.zona == 3)) {
            super.setSalario(super.getSalario() + PLUS);
            return true;
        }
        return false;
    }

}
