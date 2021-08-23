package com.estruturascontrole;

import java.util.Scanner;

public class ExercicoUm {
    public static void main(String[] args) {
        double precoVenda         = 0;
        double precoCusto         = 0;
        double valorFrete         = 0;
        double porcentagemEnvio   = 0;
        int    numeroFabrica      = 0;
        double lucro              = 0;

        System.out.print("Digite o preco de custo: ");
        Scanner entrada = new Scanner(System.in);
        precoCusto = entrada.nextDouble();

        System.out.print("Digite o numero da fabrica: ");
        Scanner entrada2 = new Scanner(System.in);
        numeroFabrica = entrada2.nextInt();

        switch (numeroFabrica) {
            case 1:
                porcentagemEnvio = 0.7;
                break;
            case 2:
                porcentagemEnvio = 0.15;
                break;
            case 3:
                porcentagemEnvio = 0.22;
                break;
            default:
                System.out.println("Numero fabrica invalido!!!");
        }

        System.out.println("Porcetagem de envio: " + porcentagemEnvio);

        valorFrete = precoCusto * porcentagemEnvio;

        precoVenda = valorFrete + precoCusto;

        lucro = 0.25 * precoVenda;

        precoVenda += lucro;

        System.out.println("O preco de venda fica em: " + precoVenda);

    }
}
