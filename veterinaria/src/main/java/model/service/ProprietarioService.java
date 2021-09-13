package model.service;

import model.entity.Proprietario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProprietarioService {

    private Proprietario proprietario;
    private List<Proprietario> listaProprietario = new ArrayList<Proprietario>();

    public List<Proprietario> getListaProprietario() {
        return listaProprietario;
    }

    public void cadastrarPropietario(int cpf, String nome, String sobreNome
            , LocalDate dataNascimento, String endereco, long telefone) {
        proprietario = new Proprietario(cpf, nome, sobreNome, dataNascimento, endereco, telefone);
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public String exibirProprietario() {
        return proprietario.toString();
    }

    public void criarListaProprietario(Proprietario proprietario) {
        listaProprietario.add(proprietario);
    }
}
