package com.genericsstreamlambda;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Veiculo veiculo1 = new Veiculo("ford", "uno", 2000);
        Veiculo veiculo2 = new Veiculo("ford", "monza", 3000);
        Veiculo veiculo3 = new Veiculo("ford", "cronos", 5000);
        Veiculo veiculo4 = new Veiculo("ford", "blazer", 7000);
        Veiculo veiculo5 = new Veiculo("ford", "spin", 1000);
        Veiculo veiculo6 = new Veiculo("ford", "logan", 8000);
        Veiculo veiculo7 = new Veiculo("ford", "tipo", 1000);
        Veiculo veiculo8 = new Veiculo("ford", "escort", 9000);
        Veiculo veiculo10 = new Veiculo("ford", "s10", 2000);
        Veiculo veiculo11 = new Veiculo("ford", "d20", 1000);

        Garagem garagem = new Garagem();

        garagem.getLista().add(veiculo1);
        garagem.getLista().add(veiculo2);
        garagem.getLista().add(veiculo3);
        garagem.getLista().add(veiculo4);
        garagem.getLista().add(veiculo5);
        garagem.getLista().add(veiculo6);
        garagem.getLista().add(veiculo7);
        garagem.getLista().add(veiculo8);
        garagem.getLista().add(veiculo10);
        garagem.getLista().add(veiculo11);

        System.out.println(garagem);

    }
}