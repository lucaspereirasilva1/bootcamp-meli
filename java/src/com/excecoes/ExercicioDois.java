package com.excecoes;

public class ExercicioDois {

    public static void main(String[] args) {

        //Mensagem final
        String mensagemFinal = "Esta é a última mensagem";

        //Código que lança exceção
        int[] numeros = new int[5];

        try {
            numeros[5] = 10;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Limite de tamanho excedido");
        }finally {
            System.out.println(mensagemFinal);
        }

    }
}
