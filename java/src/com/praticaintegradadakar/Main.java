package com.praticaintegradadakar;

public class Main {

    public static void main(String[] args) {

        SocorristaCarro socorristaCarro = new SocorristaCarro();
        SocorristaMoto socorristaMoto = new SocorristaMoto();

        //Gerando uma corrida
        Corrida corrida = new Corrida(socorristaMoto,socorristaCarro);

        //Adicionando veiculos
        corrida.adicionarCarro(100,200,90,"abc");
        corrida.adicionarMoto(100,120,90,"dbc");
        System.out.println(corrida.toString());
        System.out.println("-----------------------------------------------\n");

        //Removendo veiculos
//        corrida.removerVeiculo(corrida.getVeiculos().get(0));
//        System.out.println(corrida.toString());
//
//        System.out.println("-----------------------------------------------\n");

        //Removendo veiculo com placa
//        corrida.removerVeiculoPlaca("dbc");
//        System.out.println(corrida.toString());

        //Definindo vencedor da corrida
        corrida.vencedor(corrida.getVeiculos());

        //Socorrendo carro
        corrida.getSocorristaCarro().socorrer(corrida.getCarro());

        //Socorrendo moto
        corrida.getSocorristaMoto().socorrer(corrida.getMoto());

    }
}
