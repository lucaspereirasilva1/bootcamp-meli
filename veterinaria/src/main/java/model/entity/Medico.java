package model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;
import util.Formatador;

@Data
public class Medico {

    private Long cpf;
    private String nome;
    private String sobreNome;
    //@Setter(AccessLevel.NONE)
    private int numeroRegistro;
    private String especialidade;

    public Medico() {
    }

    public Medico(int numeroRegistro, Long cpf, String nome, String sobreNome, String especialidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.especialidade = especialidade;
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public String toString() {
        Formatador formatador = new Formatador();
        return "Medico{" +
                "cpf=" + formatador.formatarCPF(cpf.toString()) +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", numeroRegistro=" + numeroRegistro +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
