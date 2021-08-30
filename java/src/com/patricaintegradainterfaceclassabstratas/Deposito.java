package com.patricaintegradainterfaceclassabstratas;

    public class Deposito  extends Cliente implements Transacao{

    public Deposito(int conta, int saldo, String tipoCliente) {
        super(conta, saldo, tipoCliente);
    }

   public boolean depositar() {
       if (super.getTipoCliente().equals("executivo")) {
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
