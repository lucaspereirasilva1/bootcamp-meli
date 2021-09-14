package model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
public class Paciente {

    //@Setter(AccessLevel.NONE)
    private int id;
    private String especie;
    private String raca;
    private String cor;
    private LocalDate dataNascimento;
    private String nome;
    private Proprietario proprietario;
    private String tipoAnimal;

    public Paciente(int id, String especie, String raca, String cor, LocalDate dataNascimento, String nome
            , Proprietario proprietario, String tipoAnimal) {
        this.especie = especie;
        this.raca = raca;
        this.cor = cor;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.proprietario = proprietario;
        this.tipoAnimal = tipoAnimal;
        this.id = id;
    }

    public Paciente() {
    }
}
