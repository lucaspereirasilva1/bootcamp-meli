package com.collectionsmapas;

import java.util.HashMap;

public class Participante {

    int id;
    int rg;
    String nome;
    String sobreNome;
    int idade;
    int telefone;
    Long celular;
    int numeroEmergencia;
    char grupoSanguineo;
    HashMap<Integer, String> categoria;
    double valorAPagar;

    public Participante(int id, int rg, String nome, String sobreNome, int idade, int telefone, Long celular, int numeroEmergencia, char grupoSanguineo, HashMap<Integer, String> categoria) {
        this.id = id;
        this.rg = rg;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.idade = idade;
        this.telefone = telefone;
        this.celular = celular;
        this.numeroEmergencia = numeroEmergencia;
        this.grupoSanguineo = grupoSanguineo;
        this.categoria = categoria;
    }

    public Participante() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRg() {
        return rg;
    }

    public HashMap<Integer, String> getCategoria() {
        return categoria;
    }

    public void setCategoria(HashMap<Integer, String> categoria) {
        this.categoria = categoria;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public int getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(int numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public char getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(char grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "id=" + id +
                ", rg=" + rg +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade=" + idade +
                ", telefone=" + telefone +
                ", celular=" + celular +
                ", numeroEmergencia=" + numeroEmergencia +
                ", grupoSanguineo=" + grupoSanguineo +
                ", categoria=" + categoria +
                ", valorAPagar=" + valorAPagar +
                '}';
    }
}
