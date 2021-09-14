package model.service;

import model.entity.Medico;
import model.entity.Paciente;
import util.MedicoDAO;
import util.PacienteDAO;

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

    public List<Medico> carregarMedicoArquivo() {
        MedicoDAO medicoDAO = new MedicoDAO("medico.txt");
        List<String[]> lista = medicoDAO.carregarArquivo();

        List<Medico> listaMedico = new ArrayList<>();
        for (String[] s:lista) {
            Medico medico = new Medico();
            Integer id = Integer.valueOf(s[0]);
            Long cpf = Long.valueOf(s[1]);
            medico.setNumeroRegistro(id);
            medico.setCpf(cpf);
            medico.setNome(s[2]);
            medico.setEspecialidade(s[3]);
            listaMedico.add(medico);
        }
        return listaMedico;
    }
}
