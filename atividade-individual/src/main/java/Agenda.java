import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Data
@ToString
public class Agenda {

    private List<Pessoa> listaPessoa = new ArrayList<>();

    public void armazernarPessoa(Pessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public void removerPessoa(String nome) {
        listaPessoa.removeIf(p -> p.getNome().equals(nome));
    }

    public int buscarPessoa(String nome) {
        int posicao = 0;
        for (int i = 0; i < listaPessoa.size(); i ++) {
            if(nome.equals(listaPessoa.get(i).getNome())) {
                posicao = i;
            }
        }

        return posicao;
    }

    public void exibirTodaAgenda() {
        listaPessoa.forEach(System.out::println);
    }

    public void exibirPessoa(int posicao) {
        for (int i = 0; i < listaPessoa.size(); i ++) {
            if (i == posicao) {
                System.out.println(listaPessoa.get(i).toString());
            }
        }
    }

    public void listarPessoasOrdemAlfabeticaNome() {
        List<Pessoa> listaPessoa = new ArrayList<>(this.listaPessoa);
        listaPessoa.sort(Comparator.comparing(Pessoa::getNome));
        listaPessoa.forEach(System.out::println);
    }

    public void listarPessoasOrdemAlfabeticaEndereco() {
        List<Pessoa> listaPessoa = new ArrayList<>(this.listaPessoa);
        listaPessoa.sort(Comparator.comparing(Pessoa::getEndereco));
        listaPessoa.forEach(System.out::println);
    }

    public void listarPessoasOrdemAlfabeticaIdade() {
        List<Pessoa> listaPessoa = new ArrayList<>(this.listaPessoa);
        listaPessoa.sort(Comparator.comparing(Pessoa::getIdade));
        listaPessoa.forEach(System.out::println);
    }
}
