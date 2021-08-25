package com.praticaintegradadakar;

public class Carro {

    private Veiculo veiculo = new Veiculo();

    public Carro() {
        veiculo.setPeso(1000);
        veiculo.setRodas(4);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "veiculo=" + veiculo +
                '}';
    }
}
