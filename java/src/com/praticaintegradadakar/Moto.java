package com.praticaintegradadakar;

public class Moto {

    private Veiculo veiculo = new Veiculo();

    public Moto() {
        veiculo.setPeso(300);
        veiculo.setRodas(2);
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "veiculo=" + veiculo +
                '}';
    }
}
