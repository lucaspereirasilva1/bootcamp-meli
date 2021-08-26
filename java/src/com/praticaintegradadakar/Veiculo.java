package com.praticaintegradadakar;

public class Veiculo {

    private int velocidade = 0;
    private int aceleracao = 0;
    private int anguloVirada = 0;
    private String placa = "";
    private String patente = "";
    private int peso = 0;
    private int rodas = 0;
    private String tipoVeiculo = "";

    public Veiculo() {
    }

    public Veiculo(int velocidade, int aceleracao, int anguloVirada, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloVirada = anguloVirada;
        this.placa = placa;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getAnguloVirada() {
        return anguloVirada;
    }

    public void setAnguloVirada(int anguloVirada) {
        this.anguloVirada = anguloVirada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloVirada=" + anguloVirada +
                ", placa='" + placa + '\'' +
                ", patente='" + patente + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                ", tipoVeiculo='" + tipoVeiculo + '\'' +
                '}';
    }
}
