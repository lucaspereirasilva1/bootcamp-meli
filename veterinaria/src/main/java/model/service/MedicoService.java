package model.service;

import model.entity.Medico;

public class MedicoService {

    Medico medico;

    public void cadastrarMedicos(int cpf, String nome, String sobreNome, String especialidade) {
        medico = new Medico(cpf, nome, sobreNome, especialidade);
    }

    public String exibirMedico() {
        return medico.toString();
    }

}
