package com.praticaintegradadakar;

public class Moto extends Veiculo{

    public Moto(int velocidade, int aceleracao, int anguloVirada, String placa) {
        super(velocidade, aceleracao, anguloVirada, placa);
        super.setPeso(300);
        super.setRodas(2);
        super.setTipoVeiculo("moto");
    }

}
