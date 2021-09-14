package model.service;

import model.entity.Consulta;
import model.entity.Medico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MedicoService {

    private Medico medico;
    private List<Medico> listaMedico = new ArrayList<>();

    public List<Medico> getListaMedico() {
        return listaMedico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void cadastrarMedicos(int cpf, String nome, String sobreNome, String especialidade) {
        medico = new Medico(listaMedico.size(), cpf, nome, sobreNome, especialidade);
    }

    public String exibirMedico() {
        return medico.toString();
    }

    public void criarListaMedico(Medico medico) {
        listaMedico.add(medico);
    }
}
