package com.patricaintegradainterfaceclassabstratas;

public class Main {

    public static void main(String[] args) {

        Transferencia transferencia = new Transferencia(100, 1, "executivo", 1);
        System.out.println(transferencia.transferir());

        Deposito deposito = new Deposito(100, 1, "coletor");
        System.out.println(deposito.depositar());

        SaqueDinheiro saqueDinheiro = new SaqueDinheiro(100, 1, "coletor");
        System.out.println(saqueDinheiro.sacarDinheiro());

        PagamentoServico pagamentoServico = new PagamentoServico(100, 1, "basico"
                , "conserto");

        System.out.println(pagamentoServico.pagarServico());

        ConsultaSado consultaSado = new ConsultaSado(100, 1, "executivo");
        System.out.println(consultaSado.consultarSaldo());



    }
}
