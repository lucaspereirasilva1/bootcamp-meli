package com.escola;

public class Professor extends Pessoa{

    private String disciplina;


    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getId() + " - "  + disciplina);
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
