package com.patricaintegradainterfaceclassabstratas;

    public class Transferencia extends Cliente implements Transacao{

        private int valor;

        public Transferencia(int conta, int saldo, String tipoCliente, int valor) {
            super(conta, saldo, tipoCliente);
            this.valor = valor;
        }

        public boolean transferir() {
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

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }
    }
