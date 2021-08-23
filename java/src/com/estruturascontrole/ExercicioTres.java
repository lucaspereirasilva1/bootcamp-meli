package com.estruturascontrole;

import java.util.Scanner;

public class ExercicioTres {

    public static void main(String[] args) {
        String servicoUm = "Seguranca com cameras";
        String servicoDois = "Camera de seguranca";
        int precoFixo = 0;
        int servicoOpcional = 0;
        String opInvalida = "Opcao invalida, por gentileza digite novamente...";

        int contador = 1;

        while (contador <= 7) {
            int servico = 0;
            System.out.println("Cliente numero: " + contador);
            System.out.print("Digite o tipo de servico (seguranca com cameras(digite 1)/ camera de seguranca(digite 2): ");
            Scanner teclado = new Scanner(System.in);
            servico = teclado.nextInt();

            if (servico == 1) {
                precoFixo = 1500;
                System.out.println("O servico '"+ servicoUm + "' custa "+ precoFixo + " por mes");
            } else {
                if (servico == 2) {
                    System.out.print("Deseja adicinar patrula (sim(digite 1)/ nao(digite 2)? ");
                    Scanner teclado2 = new Scanner(System.in);
                    servicoOpcional = teclado2.nextInt();
                    if (servicoOpcional == 1) {
                        precoFixo += +700;
                        System.out.println("O servico '" + servicoDois + "' + 'Patrula' " + " custa " + precoFixo + " por mes");
                    }else {
                        if (servicoOpcional == 2) {
                            System.out.println("O servico '" + servicoDois + "' custa " + precoFixo + " por mes");
                        }else {
                            System.out.println(opInvalida);
                            continue;
                        }

                    }
                }else {
                    System.out.println(opInvalida);
                    continue;
                }
            }

            contador++;
        }
    }
}
