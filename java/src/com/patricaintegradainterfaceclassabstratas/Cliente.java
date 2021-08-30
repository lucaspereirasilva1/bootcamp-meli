package com.patricaintegradainterfaceclassabstratas;

public class Cliente {

    private int conta;
    private int saldo;
    private String tipoCliente;

    public Cliente(int conta, int saldo, String tipoCliente) {
        this.conta = conta;
        this.saldo = saldo;
        this.tipoCliente = tipoCliente;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "conta=" + conta +
                ", saldo=" + saldo +
                ", tipo='" + tipoCliente + '\'' +
                '}';
    }
}
