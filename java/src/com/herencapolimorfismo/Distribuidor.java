package com.herencapolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {

    public static void main(String[] args) {

        Pereciveis pereciveis = new Pereciveis("bolacha", 500,1);
        Pereciveis pereciveis2 = new Pereciveis("macarrao", 500,2);
        Pereciveis pereciveis3 = new Pereciveis("feijao", 500,3);
        Pereciveis pereciveis4 = new Pereciveis("carne", 500,1);
        Pereciveis pereciveis5 = new Pereciveis("miojo", 500,2);

        NaoPerecives naoPerecives = new NaoPerecives("perfume", 20);
        NaoPerecives naoPerecives2 = new NaoPerecives("arroz", 20);
        NaoPerecives naoPerecives3 = new NaoPerecives("milho", 20);
        NaoPerecives naoPerecives4 = new NaoPerecives("ervilha", 20);
        NaoPerecives naoPerecives5 = new NaoPerecives("oleo", 20);

//        System.out.println(pereciveis.toString());
//        System.out.println(naoPerecives.toString());

//        double precoTotal = produto.calcule(10);
//        System.out.println(precoTotal);

        double precoTotalPerecivel = pereciveis.calcule(2);
        System.out.println(precoTotalPerecivel);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(pereciveis);
        produtos.add(pereciveis2);
        produtos.add(pereciveis3);
        produtos.add(pereciveis4);
        produtos.add(pereciveis5);
        produtos.add(naoPerecives);
        produtos.add(naoPerecives2);
        produtos.add(naoPerecives3);
        produtos.add(naoPerecives4);
        produtos.add(naoPerecives5);

        double valor = 0;
        for (Produto produto: produtos) {

            if(produto instanceof Pereciveis){
                valor += produto.getPrice();
                System.out.println("Produto perecivel: " + produto.toString());
            }

        }

        System.out.println("Preco Total pereciveis: " + valor);

        double valor2 = 0;
        for (Produto produto: produtos) {

            if(produto instanceof NaoPerecives){
                valor2 += produto.getPrice();
                System.out.println("Produto perecivel: " + produto.toString());
            }

        }

        System.out.println("Preco Total nao pereciveis: " + valor2);

    }
}
