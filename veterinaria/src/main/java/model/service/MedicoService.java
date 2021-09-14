package model.service;

import model.entity.Medico;
import util.MedicoDAO;

import java.util.ArrayList;
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

    public void cadastrarMedicos(long cpf, String nome, String sobreNome, String especialidade) {
        medico = new Medico(listaMedico.size(), cpf, nome, sobreNome, especialidade);
        MedicoDAO medicoDAO = new MedicoDAO("medico.txt");
        medicoDAO.salva(medico);
        medicoDAO.fechar();
    }

    public void adicionarListaMedico(Medico medico) {
        listaMedico.add(medico);
    }
}
