package com.patricaintegradainterfaceclassabstratas;

    public class PagamentoServico extends Cliente implements Transacao{

        private String tipoServico;

        public PagamentoServico(int conta, int saldo, String tipoCliente, String tipoServico) {
            super(conta, saldo, tipoCliente);
            this.tipoServico = tipoServico;
        }

        public boolean pagarServico() {
            if (super.getTipoCliente().equals("basico")) {
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
