package com.genericsstreamlambda;

import java.util.ArrayList;
import java.util.List;

public class Garagem <E> {

    private int id;
    List<E> lista = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<E> getLista() {
        return lista;
    }

    public void setLista(List<E> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Garagem{" +
                "id=" + id +
                ", lista=" + lista +
                '}';
    }
}