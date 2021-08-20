package com.company;

import java.util.Scanner;

public class ExercicioModuloCinco {

    public static void main(String[] args) {
        exercicioTres();
        exercicioQuatro();
    }

    //Exercicio 1
    String apelido = "Gomez";
    int idade = 35;
    boolean verdadeiroFalso = false;
    double saldo = 45857.90;
    String nome = "Julián";

    //Exercicio 2
    String nomeum;
    int idadeum;
    double saldoum;
    String apellido;
    String direcao;
    boolean carteiraDeMotorista;
    double alturaDaPessoa;
    int quantidadeDeFilhos;

    public static void exercicioTres() {
        int precoDia = 2;
        int total = 0;
        int dia = 0;

        System.out.print("Digite o numero de dias:");
        Scanner teclado = new Scanner(System.in);
        dia = teclado.nextInt();
        total = precoDia * dia;

        System.out.println(dia + " dias de campanha custam: " + total);
    }

    public static void exercicioQuatro() {
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
