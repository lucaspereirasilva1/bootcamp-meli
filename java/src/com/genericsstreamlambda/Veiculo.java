package com.genericsstreamlambda;

public class Veiculo {

    private String modelo;
    private String marca;
    private int custo;


    public Veiculo(String modelo, String marca, int custo) {
        this.modelo = modelo;
        this.marca = marca;
        this.custo = custo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", custo=" + custo +
                '}';
    }
}