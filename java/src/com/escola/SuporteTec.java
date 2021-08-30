package com.escola;

public class SuporteTec extends Pessoa{

    private String equipamento;

    @Override
    public void imprimirDados() {
        System.out.println(super.getNome() + " - " + super.getId() + " - "  + equipamento);
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
}
