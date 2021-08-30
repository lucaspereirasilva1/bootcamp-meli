package com.escola;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Funcionario();
        Funcionario funcionario = (Funcionario) pessoa;
        Pessoa pessoa1 = new Manutencao();
        Manutencao manutencao = (Manutencao) pessoa1;
        Pessoa pessoa2 = new SuporteTec();
        SuporteTec suporteTec = (SuporteTec) pessoa2;
        Pessoa pessoa3 = new Aluno();
        Aluno aluno = (Aluno) pessoa3;
        Pessoa pessoa4 = new Professor();
        Professor professor = (Professor) pessoa4;


        funcionario.setNome("Lucas");
        funcionario.setId(123);
        funcionario.setDepartamento("Administracao");
        funcionario.imprimirDados();

        manutencao.setNome("Joao");
        manutencao.setId(456);
        manutencao.setArea("Eletrica");
        manutencao.imprimirDados();

        suporteTec.setNome("Ed");
        suporteTec.setId(789);
        suporteTec.setEquipamento("Computador");
        suporteTec.imprimirDados();

        aluno.setNome("Rafael");
        aluno.setId(234);
        aluno.setSerie("Oitava");
        aluno.imprimirDados();

        professor.setNome("Mauri");
        professor.setId(456);
        professor.setDisciplina("Portugues");
        professor.imprimirDados();

    }
}
