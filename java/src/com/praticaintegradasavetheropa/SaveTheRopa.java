package com.praticaintegradasavetheropa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SaveTheRopa {
    public static void main(String[] args) {
        //Roupa
        Roupa roupa = new Roupa("Nike", "t-shirt");
        Roupa roupa2 = new Roupa("Adidas", "long shirt");

        Roupa roupa3 = new Roupa("Fila", "cano alto");
        Roupa roupa4 = new Roupa("Puma", "cano baixo");

        //Camiseta
        List<Roupa> listaRoupas = new ArrayList<Roupa>();
        listaRoupas.add(roupa);
        listaRoupas.add(roupa2);

        //Tenis
        List<Roupa> listaRoupas2 = new ArrayList<Roupa>();
        listaRoupas2.add(roupa3);
        listaRoupas2.add(roupa4);

        //GuardaRoupa - camiseta
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        guardaRoupa.guardarRoupas(listaRoupas);
        guardaRoupa.guardarRoupas(listaRoupas2);
        System.out.println(guardaRoupa.toString());



    }
}
