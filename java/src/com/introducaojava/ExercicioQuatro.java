package com.introducaojava;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        double impostoUm   = 2.45/100;
        double impostoDois = 15.0/100;
        double impostoTres = 3.0/100;
        //double premioTotal = 23563899;
        double valorTotal = 0;
        double valorBruto = 0;

        System.out.print("Insira o valor bruto do premio: ");
        Scanner teclado = new Scanner(System.in);

        valorBruto = teclado.nextDouble();

        impostoUm   = impostoUm   * valorBruto;
        System.out.println("Imposto 1: " + impostoUm);
        impostoDois = impostoDois * valorBruto;
        System.out.println("Imposto 2: " + impostoDois);
        impostoDois = impostoTres * valorBruto;
        System.out.println("Imposto 3: " + impostoDois);

        valorTotal = impostoUm + impostoDois + impostoTres + valorBruto;

        System.out.println("Valor final do premio e: " + valorTotal);
    }
}
