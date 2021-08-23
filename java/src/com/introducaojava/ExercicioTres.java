package com.introducaojava;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        int precoDia = 2;
        int total = 0;
        int dia = 0;

        System.out.print("Digite o numero de dias:");
        Scanner teclado = new Scanner(System.in);
        dia = teclado.nextInt();
        total = precoDia * dia;

        System.out.println(dia + " dias de campanha custam: " + total);
    }
}
