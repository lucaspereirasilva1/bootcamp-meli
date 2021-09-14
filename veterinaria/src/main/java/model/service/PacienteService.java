package model.service;

import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacienteService {

    private LocalDate dataNascimento = LocalDate.now();
    private Paciente paciente;
    private List<Paciente> listaPaciente = new ArrayList<>();

    public List<Paciente> getListaPaciente() {
        return listaPaciente;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void cadastarPaciente(String especie, String raca, String cor, LocalDate dataNascimento
            , String nome, Proprietario proprietario, String tipoAnimal) {
        paciente = new Paciente(listaPaciente.size(), especie, raca, cor, dataNascimento, nome, proprietario, tipoAnimal);
    }

//    public List<Paciente> criarListaPaciente() {
//        return Arrays.asList(new Paciente("cachorro", "vira-lata", "preto", dataNascimento, "rex"
//                        , new
//                        Proprietario(123, "lucas", "pereira", dataNascimento, "rua zero", 11988887777L)
//                        , "domestico ")
//                , new Paciente("galinha", "cachorrao", "preto", dataNascimento, "aa"
//                        , new Proprietario(123, "ed", "pereira", dataNascimento
//                        , "rua zero", 11988887777L)
//                        , "selvagem "));
//
//    }

    public void listarPacienteProprietarios(List<Paciente> listaPaciente) {
        listaPaciente.sort((Paciente p1, Paciente p2) -> p1.getProprietario().getNome().compareTo(p2.getProprietario().getNome()));
    }

    public void criarListaPaciente(Paciente paciente) {
            listaPaciente.add(paciente);
    }
}
