package com.escola;

public class Funcionario extends Pessoa{

    private String departamento;

    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getId() + " - "  + departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
