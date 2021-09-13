package model.service;

import model.entity.Paciente;
import model.entity.Proprietario;

import java.time.LocalDate;

public class PacienteService {

    Paciente paciente;

    public void cadastarPaciente(String especie, String raca, String cor, LocalDate dataNascimento
            , String nome, Proprietario proprietario, String tipoAnimal) {
        paciente = new Paciente(especie, raca, cor, dataNascimento, nome, proprietario, tipoAnimal);
    }
}
