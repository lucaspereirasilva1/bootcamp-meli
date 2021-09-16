package atividademanha.model.service;

import lombok.Data;
import atividademanha.model.entity.Agenda;
import atividademanha.model.entity.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
public class AgendaService {

    private Agenda agenda = new Agenda();

    public void armazernarPessoa(Pessoa pessoa) {
        agenda.getListaPessoa().add(pessoa);
    }

    public void removerPessoa(String nome) {
        agenda.getListaPessoa().removeIf(p -> p.getNome().equals(nome));
    }

    public int buscarPessoa(String nome) {
        int posicao = 0;
        for (int i = 0; i < agenda.getListaPessoa().size(); i ++) {
            if(nome.equals(agenda.getListaPessoa().get(i).getNome())) {
                posicao = i;
            }
        }

        return posicao;
    }

    public void exibirTodaAgenda() {
        agenda.getListaPessoa().forEach(System.out::println);
    }

    public void exibirPessoa(int posicao) {
        for (int i = 0; i < agenda.getListaPessoa().size(); i ++) {
            if (i == posicao) {
                System.out.println(agenda.getListaPessoa().get(i).toString());
            }
        }
    }

    public void listarPessoasOrdemAlfabeticaNome() {
        List<Pessoa> listaPessoa = new ArrayList<>(agenda.getListaPessoa());
        listaPessoa.sort(Comparator.comparing(Pessoa::getNome));
        listaPessoa.forEach(System.out::println);
    }

    public void listarPessoasOrdemAlfabeticaEndereco() {
        List<Pessoa> listaPessoa = new ArrayList<>(agenda.getListaPessoa());
        listaPessoa.sort(Comparator.comparing(Pessoa::getEndereco));
        listaPessoa.forEach(System.out::println);
    }

    public void listarPessoasOrdemAlfabeticaIdade() {
        List<Pessoa> listaPessoa = new ArrayList<>(agenda.getListaPessoa());
        listaPessoa.sort(Comparator.comparing(Pessoa::getIdade));
        listaPessoa.forEach(System.out::println);
    }

}
