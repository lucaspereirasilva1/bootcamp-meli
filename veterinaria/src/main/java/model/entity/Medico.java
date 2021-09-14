package model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString
public class Medico {

    private int cpf;
    private String nome;
    private String sobreNome;
    @Setter(AccessLevel.NONE)
    private int numeroRegistro;
    private String especialidade;

    public Medico(int numeroRegistro, int cpf, String nome, String sobreNome, String especialidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
    }

}
