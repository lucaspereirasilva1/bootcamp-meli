package com.vetoresmatrizes;

import java.text.DecimalFormat;

public class ExercicioUm {
    public static void main(String[] args) {

        String[] cidade = new String[10];
        float[][] temperatura = new float[10][10];

        cidade[0] = "Londres";
        cidade[1] = "Madri";
        cidade[2] = "Nova York";
        cidade[3] = "Buenos Aires";
        cidade[4] = "Assuncao";
        cidade[5] = "Sao Paulo";
        cidade[6] = "Lima";
        cidade[7] = "Santiago de Chile";
        cidade[8] = "Lisboa";
        cidade[9] = "Tokio";

        temperatura[0][0] = -2;
        temperatura[0][1] = -3;
        temperatura[0][2] = -8;
        temperatura[0][3] = 4;
        temperatura[0][4] = 6;
        temperatura[0][5] = 5;
        temperatura[0][6] = 0;
        temperatura[0][7] = -7;
        temperatura[0][8] = -1;
        temperatura[0][9] = -10;
        temperatura[1][0] = 33;
        temperatura[1][1] = 32;
        temperatura[1][2] = 27;
        temperatura[1][3] = 37;
        temperatura[1][4] = 42;
        temperatura[1][5] = 43;
        temperatura[1][6] = 39;
        temperatura[1][7] = 26;
        temperatura[1][8] = 31;
        temperatura[1][9] = 35;

        float menorTemperatura = 0;
        float maiorTemperatura = 0;
        String cidadeMenorTemperatura = "";
        String cidadeMaiorTemperatura = "";
        float tempMin = 0;
        float tempMax = 0;

        for (int i = 0; i < cidade.length; i++) {
            for (int x = 0; x < 2; x++) {
                for (int z = 0; z < 10; z++) {
                    if ((x == 0) && (z == i)){
                        tempMin = temperatura[x][z];
                        if (temperatura[x][z] < menorTemperatura) {
                            menorTemperatura = temperatura[x][z];
                            cidadeMenorTemperatura = cidade[i];
                        }
                        z = 9;
                    }
                    if ((x == 1) && (z == i)) {
                        tempMax = temperatura[x][z];
                        if (temperatura[x][z] > maiorTemperatura) {
                            maiorTemperatura = temperatura[x][z];
                            cidadeMaiorTemperatura = cidade[i];
                        }
                        z = 9;
                    }
                }
            }

            DecimalFormat decimalFormat = new DecimalFormat("##");
            System.out.println(cidade[i] + ": min "+ decimalFormat.format(tempMin) + " max " + decimalFormat.format(tempMax));
        }

        System.out.println("A maior temperatura registrada foi " + maiorTemperatura + " em "  + cidadeMaiorTemperatura);
        System.out.println("A menor temperatura registrada foi " + menorTemperatura + " em "  + cidadeMenorTemperatura);
    }
}
