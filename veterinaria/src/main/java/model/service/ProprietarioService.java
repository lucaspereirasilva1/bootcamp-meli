package model.service;

import model.entity.Proprietario;
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

}
