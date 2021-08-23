package com.estruturascontrole;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double salario;
        double novoSalario;

        System.out.print("Digite o salario: ");
        salario = teclado.nextDouble();


        if (salario <= 20000){
            novoSalario = salario + salario * 0.20;
        } else if (salario <= 45000){
            novoSalario = salario + salario * 0.10;
        } else {
            novoSalario = salario + salario * 0.05;
        }

        System.out.println("O salario ajustado e: R$ " + novoSalario);

    }
}
