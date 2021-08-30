package com.praticaintegradasavetheropa;

public class Roupa {

    String marca;
    String modelo;
    int id;

    public Roupa() {
    }

    public Roupa(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Roupa{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo +
                '}';
    }
}
