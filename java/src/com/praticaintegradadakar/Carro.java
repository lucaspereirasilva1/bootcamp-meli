package com.praticaintegradadakar;

public class Carro extends Veiculo{

    public Carro(int velocidade, int aceleracao, int anguloVirada, String placa) {
        super(velocidade, aceleracao, anguloVirada, placa);
        super.setPeso(1000);
        super.setRodas(4);
        super.setTipoVeiculo("carro");
    }
}
