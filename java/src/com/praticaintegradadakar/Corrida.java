package com.praticaintegradadakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private int distancia = 0;
    private int premio = 0;
    private String nome = "";
    private int qtdeVeiculo = 0;
    private List<Veiculo> veiculos = new ArrayList<>();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();
    private SocorristaCarro socorristaCarro = new SocorristaCarro();


    public Corrida(SocorristaMoto socorristaMoto, SocorristaCarro socorristaCarro) {
        this.socorristaMoto = socorristaMoto;
        this.socorristaCarro = socorristaCarro;
    }

    public Corrida(int distancia, int premio, String nome, int qtdeVeiculo, List<Veiculo> veiculos,
                   SocorristaMoto socorristaMoto, SocorristaCarro socorristaCarro) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.qtdeVeiculo = qtdeVeiculo;
        this.veiculos = veiculos;
        this.socorristaMoto = socorristaMoto;
        this.socorristaCarro = socorristaCarro;
    }

    public void adicionarCarro(int velocidade, int aceleracao, int anguloVirada, String placa){
        Carro carro = new Carro();
        Veiculo veiculo = new Veiculo();
        carro.getVeiculo().setVelocidade(velocidade);
        carro.getVeiculo().setAceleracao(aceleracao);
        carro.getVeiculo().setAnguloVirada(anguloVirada);
        carro.getVeiculo().setPlaca(placa);
        veiculo.setCarro(carro);
        veiculos.add(veiculo);
        this.qtdeVeiculo++;
        System.out.println("Carro adicionado " + carro);
    }

    public void adicionarMoto(int velocidade, int aceleracao, int anguloVirada, String placa){
        Moto moto = new Moto();
        Veiculo veiculo = new Veiculo();
        moto.getVeiculo().setVelocidade(velocidade);
        moto.getVeiculo().setAceleracao(aceleracao);
        moto.getVeiculo().setAnguloVirada(anguloVirada);
        moto.getVeiculo().setPlaca(placa);
        veiculo.setMoto(moto);
        veiculos.add(veiculo);
        this.qtdeVeiculo++;
        System.out.println("Moto adicionada " + moto);
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremio() {
        return premio;
    }

    public void setPremio(int premio) {
        this.premio = premio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdeVeiculo() {
        return qtdeVeiculo;
    }

    public void setQtdeVeiculo(int qtdeVeiculo) {
        this.qtdeVeiculo = qtdeVeiculo;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public SocorristaMoto getSocorristaMoto() {
        return socorristaMoto;
    }

    public void setSocorristaMoto(SocorristaMoto socorristaMoto) {
        this.socorristaMoto = socorristaMoto;
    }

    public SocorristaCarro getSocorristaCarro() {
        return socorristaCarro;
    }

    public void setSocorristaCarro(SocorristaCarro socorristaCarro) {
        this.socorristaCarro = socorristaCarro;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distancia=" + distancia +
                ", premio=" + premio +
                ", nome='" + nome + '\'' +
                ", qtdeVeiculo=" + qtdeVeiculo +
                ", veiculos=" + veiculos +
                ", socorristaMoto=" + socorristaMoto +
                ", socorristaCarro=" + socorristaCarro +
                '}';
    }
}
