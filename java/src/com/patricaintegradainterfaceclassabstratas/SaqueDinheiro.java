package com.patricaintegradainterfaceclassabstratas;

public class SaqueDinheiro extends Cliente implements Transacao{

    public SaqueDinheiro(int conta, int saldo, String tipo) {
        super(conta, saldo, tipo);
    }

    public boolean sacarDinheiro() {
        if ((super.getTipoCliente().equals("basico")) || (super.getTipoCliente().equals("coletor"))) {
            return transactionOK();
        }else {
            return transactionNoOK();
        }
    }

    @Override
    public boolean transactionOK() {
        return true;
    }

    @Override
    public boolean transactionNoOK() {
        return false;
    }
}
