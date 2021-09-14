package model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import util.Formatador;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Proprietario {

    private Long cpf;
    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private String endereco;
    private long telefone;

    public Proprietario() {

    }

    @Override
    public String toString() {
        Formatador formatador = new Formatador();
        return "Proprietario{" +
                "cpf=" + formatador.formatarCPF(cpf.toString()) +
                ", nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
