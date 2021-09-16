import model.entity.Agenda;
import model.entity.Pessoa;
import model.service.AgendaService;

public class Main {

    public static void main(String[] args) {

        int posicao = 0;

        //Criando Objeto model.entity.Pessoa e model.entity.Agenda
        Pessoa pessoa = new Pessoa("lucas", "rua zero", "99998888", 18, 1.75);
        Pessoa pessoa2 = new Pessoa("jessica", "rua dois", "88887777", 20, 1.50);
        Pessoa pessoa3 = new Pessoa("ed", "rua tres", "66665555", 25, 2.00);
        Pessoa pessoa4 = new Pessoa("jefferson", "rua quatro", "88887777", 21, 1.75);
        Pessoa pessoa5 = new Pessoa("joyce", "rua cinco", "66665555", 22, 1.10);
        Pessoa pessoa6 = new Pessoa("katia", "rua seis", "88887777", 23, 1.45);
        Pessoa pessoa7 = new Pessoa("kenyo", "rua sete", "66665555", 24, 1.34);
        Pessoa pessoa8 = new Pessoa("hugo", "rua oito", "88887777", 27, 1.67);
        Pessoa pessoa9 = new Pessoa("mauri", "rua nove", "66665555", 28, 1.90);
        AgendaService agendaService = new AgendaService();

        //Armazenando pessoa
        System.out.println("--------------------armazenarPessoa--------------------");
        agendaService.armazernarPessoa(pessoa);
        agendaService.armazernarPessoa(pessoa2);
        agendaService.armazernarPessoa(pessoa3);
        agendaService.armazernarPessoa(pessoa4);
        agendaService.armazernarPessoa(pessoa5);
        agendaService.armazernarPessoa(pessoa6);
        agendaService.armazernarPessoa(pessoa7);
        agendaService.armazernarPessoa(pessoa8);
        agendaService.armazernarPessoa(pessoa9);
        System.out.println(agendaService.getAgenda().getListaPessoa().toString());

        //Removendo pessoa
        System.out.println("--------------------removerPessoa--------------------");
        agendaService.removerPessoa("lucas");
        System.out.println(agendaService.getAgenda().getListaPessoa().toString());

        //Buscando pessoa
        System.out.println("--------------------buscarPessoa--------------------");
        System.out.println(agendaService.buscarPessoa("jessica"));

        //Exbindo todas as pessoas
        System.out.println("--------------------exibirAgenda--------------------");
        agendaService.exibirTodaAgenda();

        //Buscando pessoa por posicao
        System.out.println("--------------------exibirPessoa--------------------");
        agendaService.exibirPessoa(1);

        //Listando pesssoas ordem alfabetica nome
        System.out.println("--------------------listarPessoasOrdemAlfabeticaNome--------------------");
        agendaService.listarPessoasOrdemAlfabeticaNome();

        System.out.println("--------------------listarPessoasOrdemAlfabeticaEndereco--------------------");
        //Listando pesssoas ordem alfabetica endereco
        agendaService.listarPessoasOrdemAlfabeticaEndereco();

        System.out.println("--------------------listarPessoasOrdemAlfabeticaIdade--------------------");
        //Listando pesssoas ordem alfabetica endereco
        agendaService.listarPessoasOrdemAlfabeticaIdade();





    }
}
