package model.service;

import model.entity.Proprietario;

import java.time.LocalDate;

public class ProprietarioService {

    Proprietario proprietario;

    public void cadastrarPropietario(int cpf, String nome, String sobreNome
            , LocalDate dataNascimento, String endereco, long telefone) {
        proprietario = new Proprietario(cpf, nome, sobreNome, dataNascimento, endereco, telefone);
    }

    public String exibirProprietario() {
        return proprietario.toString();
    }
}
