package atividadetarde.exerciciocinco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int id = 0;

        while(true) {

            Cliente cliente = new Cliente();
            Scanner teclado;
            String nome;
            String cpf;
            String telefone;
            String email;
            String endereco;
            int opcao;

            while(true) {
                System.out.print("Digite nome: ");
                teclado = new Scanner(System.in);
                nome = teclado.nextLine();
                if (cliente.validarNome(nome)){
                    System.out.println("nome valido");
                    cliente.setNome(nome);
                    break;
                } else {
                    System.out.println("nome invalido");
                }
            }

            while(true) {
                System.out.println("Digite cpf: ");
                teclado = new Scanner(System.in);
                cpf = teclado.nextLine();
                if (cliente.validarCpf(cpf)) {
                    System.out.println("cpf valido");
                    cliente.setCpf(cpf);
                    break;
                } else {
                    System.out.println("cpf invalido");
                }
            }

            while(true) {
                System.out.println("Digite email: ");
                teclado = new Scanner(System.in);
                email = teclado.nextLine();
                if (cliente.validarEmail(email)) {
                    System.out.println("email valido");
                    cliente.setEmail(email);
                    break;
                } else {
                    System.out.println("email invalido");
                }
            }

            while(true) {
                System.out.println("Digite telefone: ");
                teclado = new Scanner(System.in);
                telefone = teclado.nextLine();
                if (cliente.validarTelefone(telefone)) {
                    System.out.println("telefone valido");
                    cliente.setTelefone(telefone);
                    break;
                } else {
                    System.out.println("telefone invalido");
                }
            }

            System.out.println("Digite o endereco: ");
            teclado = new Scanner(System.in);
            endereco = teclado.nextLine();
            cliente.setEndereco(endereco);
            cliente.setId(++id);

            System.out.println("Cliente cadastrado: " + cliente.toString());

            System.out.println("Deseja cadastrar mais um cliente?: (sim = 1, nao= 2)");
            teclado = new Scanner(System.in);
            opcao = teclado.nextInt();
            if(opcao == 2) {
                break;
            }
        }
    }
}
