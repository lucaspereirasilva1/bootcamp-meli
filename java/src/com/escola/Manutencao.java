package com.escola;

public class Manutencao extends Pessoa{

    private String area;

    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getId() + " - "  + area);
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
