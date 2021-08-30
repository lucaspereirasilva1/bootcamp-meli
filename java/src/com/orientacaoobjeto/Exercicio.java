package com.orientacaoobjeto;

public class Exercicio {

    public static void main(String[] args) {
        int resultadoImc = 0;
        Pessoa pessoa = new Pessoa("1", "Lucas", 18, 100, 1.75);

        resultadoImc = calcularImc(pessoa.getPeso(), pessoa.getAltura());

        exibirDados(resultadoImc, pessoa);
    }

    public static int calcularImc(double peso, double altura) {
        double imc = 0;
        imc = (peso/(Math.pow(altura,2)));

        if (imc < 20) {
            return -1;
        }else {
            if ((imc <= 25) && (imc >= 20)) {
                return 0;
            }else {
                return 1;
            }
        }
    }

    public static boolean eMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void exibirDados (int resultadoImc, Pessoa pessoa) {
        String maiorIdade = eMaiorDeIdade(pessoa.getIdade()) ? "maior de idade" : "menor de idade";
        if (resultadoImc == -1) {
            System.out.println("A pessoa " + pessoa.toString() + ", sendo " + maiorIdade + ", e abaixo do peso" );
        }else {
            if (resultadoImc == 0) {
                System.out.println("A pessoa " + pessoa.toString() + ", sendo " + maiorIdade + ", e no peso ideal" );
            }else {
                System.out.println("A pessoa " + pessoa.toString() + ", sendo " + maiorIdade + ", e acima do peso" );
            }
        }
    }
}
