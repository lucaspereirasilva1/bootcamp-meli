package com.praticaintegradoraempresa;

public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Lucas", 6, 1000, 6000);

        if(vendedor.calculePlus()) {
            System.out.println("Vendedor " + vendedor.getNome() +
                    " teve salario aumentado. Salario atual " + vendedor.getSalario());
        }else {
            System.out.println("Vendedor " + vendedor.getNome() +
                    " nao teve salario aumentado. Salario atual " + vendedor.getSalario());
        }

        Entregador entregador = new Entregador("Lucas", 2, 1000, 4);
        if(entregador.calculePlus()) {
            System.out.println("Entregador " + entregador.getNome() +
                    " teve salario aumentado. Salario atual " + entregador.getSalario());
        }else {
            System.out.println("Entregador " + entregador.getNome() +
                    " nao teve salario aumentado. Salario atual " + entregador.getSalario());
        }

    }
}
