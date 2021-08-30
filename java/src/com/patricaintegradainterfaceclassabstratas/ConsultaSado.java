package com.patricaintegradainterfaceclassabstratas;

    public class ConsultaSado extends Cliente implements Transacao{

    public ConsultaSado(int conta, int saldo, String tipoCliente) {
        super(conta, saldo, tipoCliente);
    }

    public boolean consultarSaldo() {
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
