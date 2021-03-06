package com.praticaintegradadakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private int distancia;
    private int premio;
    private String nome;
    private int qtdeVeiculo;
    private List<Veiculo> veiculos = new ArrayList<>();
    private SocorristaMoto socorristaMoto = new SocorristaMoto();
    private SocorristaCarro socorristaCarro = new SocorristaCarro();
    private Carro carro;
    private Moto moto;



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
        this.carro = new Carro(velocidade, aceleracao, anguloVirada, placa);
        this.veiculos.add(this.carro);
        this.qtdeVeiculo++;
        System.out.println("Carro adicionado " + this.carro);
    }

    public void adicionarMoto(int velocidade, int aceleracao, int anguloVirada, String placa){
        this.moto = new Moto(velocidade, aceleracao, anguloVirada, placa);
        this.veiculos.add(this.moto);
        this.qtdeVeiculo++;
        System.out.println("Moto adicionada " + this.moto);
    }
    public void removerVeiculo(Veiculo veiculo){
        this.veiculos.remove(veiculo);
        this.qtdeVeiculo--;
    }
    public void vencedor(List<Veiculo> veiculos){
        double valorMax = 0;
        int posicao = 0;
        for (int i = 0; i < veiculos.size(); i++){
            double valor = (veiculos.get(i).getVelocidade() * (veiculos.get(i).getAceleracao() * 0.5)) /
                    (veiculos.get(i).getAnguloVirada() * (veiculos.get(i).getPeso() -
                            veiculos.get(i).getRodas() * 100));

            if (valorMax < valor){
                valorMax = valor;
                posicao = i;
            }

        }
        System.out.println("O vencedor e "+ veiculos.get(posicao).toString());
    }

    public void removerVeiculoPlaca(String placa){
        for (int i = 0; i < this.veiculos.size(); i++) {
            if (this.veiculos.get(i).getPlaca().equals(placa)){
                System.out.println("Veiculo removido " + this.veiculos.get(i));
                this.veiculos.remove(this.veiculos.get(i));
            }
            this.qtdeVeiculo--;
        }
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

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
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
