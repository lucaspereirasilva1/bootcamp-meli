package model.service;

import model.entity.Medico;
import model.entity.Proprietario;
import util.MedicoDAO;
import util.ProprietarioDAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProprietarioService {

    private Proprietario proprietario;
    private List<Proprietario> listaProprietario = new ArrayList<>();

    public List<Proprietario> getListaProprietario() {
        return listaProprietario;
    }

    public void cadastrarPropietario(long cpf, String nome, String sobreNome
            , LocalDate dataNascimento, String endereco, long telefone) {
        proprietario = new Proprietario(cpf, nome, sobreNome, dataNascimento, endereco, telefone);
        ProprietarioDAO proprietarioDAO = new ProprietarioDAO("proprietario.txt");
        proprietarioDAO.salva(proprietario);
        proprietarioDAO.fechar();
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void adcionarListaProprietario(Proprietario proprietario) {
        listaProprietario.add(proprietario);
    }

    public List<Proprietario> carregarProprietarioArquivo() {
        ProprietarioDAO proprietarioDAO = new ProprietarioDAO("proprietario.txt");
        List<String[]> lista = proprietarioDAO.carregarArquivo();

        List<Proprietario> listaProprietario = new ArrayList<>();
        for (String[] s:lista) {
            Proprietario proprietario = new Proprietario();
            Long cpf = Long.valueOf(s[0]);
            proprietario.setCpf(cpf);
            proprietario.setNome(s[1]);
            proprietario.setSobreNome(s[2]);
            listaProprietario.add(proprietario);
        }
        return listaProprietario;
    }
}
