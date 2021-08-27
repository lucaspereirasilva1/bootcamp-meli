package com.excecoes;

public class ExcercioUm {

    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        try {
            calcularQuociente(b, a);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("Programa finalizado!!!");
        }
    }

    public static int calcularQuociente(int b, int a) {
        return b/a;
    }

}
