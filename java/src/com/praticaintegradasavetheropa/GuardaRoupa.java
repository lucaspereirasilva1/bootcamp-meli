package com.praticaintegradasavetheropa;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    HashMap<Integer, List<Roupa>> guardaRoupa;
    int key = 0;

    public GuardaRoupa() {
    }

    public HashMap<Integer, List<Roupa>> getGuardaRoupa() {
        return guardaRoupa;
    }

    public void setGuardaRoupa(HashMap<Integer, List<Roupa>> guardaRoupa) {
        this.guardaRoupa = guardaRoupa;
    }

    public void guardarRoupas(List<Roupa> listaDeRoupas) {
        this.guardaRoupa = new HashMap<>();
        this.guardaRoupa.put(key++,listaDeRoupas);
    }

    public void mostrarRoupas() {
        System.out.println();
    }


    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "guardaRoupa=" + guardaRoupa +
                '}';
    }
}
