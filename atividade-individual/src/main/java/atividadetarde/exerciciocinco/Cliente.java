package atividadetarde.exerciciocinco;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Cliente {

    private String nome;
    private int id;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;

    public Cliente() {
    }

    public Cliente(String nome, int id, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
    }

    public boolean validarNome(String nome) {
        return nome.length() >= 3 && nome.length() <= 50;
    }


    public boolean validarCpf(String cpf) {
        return cpf.length() == 11;
    }

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public boolean validarTelefone(String telefone) {
        return telefone.length() == 11;
    }
}
