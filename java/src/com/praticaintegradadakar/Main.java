package com.praticaintegradadakar;

public class Main {

    public static void main(String[] args) {

//        Veiculo veiculo = new Veiculo();
//        Carro carro = new Carro();
//
//        Veiculo veiculo2 = new Veiculo();
//        Moto moto = new Moto();

//        System.out.println(moto);
//        System.out.println(carro);

        SocorristaCarro socorristaCarro = new SocorristaCarro();
//        socorristaCarro.socorrer(carro);
        SocorristaMoto socorristaMoto = new SocorristaMoto();
//        socorristaMoto.socorrer(moto);

        Corrida corrida = new Corrida(socorristaMoto,socorristaCarro);

        corrida.adicionarCarro(100,200,90,"abc");
        corrida.adicionarMoto(100,120,90,"dbc");
        System.out.println(corrida.toString());

        corrida.getSocorristaCarro().socorrer(corrida.getVeiculos().get(0).getCarro());

    }
}
