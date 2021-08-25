package com.collectionsmapas;

import java.util.*;

public class ExercicioUm {

    static List<Participante> participanteList = new ArrayList<>();
    static Participante participante = new Participante();
    static Participante participante2 = new Participante();
    static Participante participante3 = new Participante();
    static Participante participante4 = new Participante();
    static Participante participante5 = new Participante();



    public static void main(String[] args) {
        criar();
        exibirCadastro(2);
        cancelarIncricao(0);
    }

    public static void criar() {
        int id = 0;
        boolean criar = true;
        HashMap<Integer, String> categoria = new HashMap<>();


        categoria = criarCategoria(2,"pequeno circuito");
        participante = new Participante(id,172153748,"Lucas","Pereira",16, 1199998888
                , 11999998888L, 1166665555, 'O',categoria);
        criar = valorAPagar(participante.getIdade(), participante.getCategoria()) != 0;
        validaCriacao(criar, participante);
        id++;

        categoria = criarCategoria(5,"circuito medio");
        participante2 = new Participante(id,172153748,"Jose","Santos",18, 1199998888
                , 11999998888L, 1166665555, 'O',categoria);
        criar = valorAPagar(participante2.getIdade(), participante2.getCategoria()) != 0;
        validaCriacao(criar, participante2);
        id++;

        categoria = criarCategoria(10,"circuito avancado");
        participante3 = new Participante(id,172153748,"Salvador","Moraes",16, 1199998888
                , 11999998888L, 1166665555, 'O',categoria);
        criar = valorAPagar(participante3.getIdade(), participante3.getCategoria()) != 0;
        validaCriacao(criar, participante3);
        id++;

        categoria = criarCategoria(2,"pequeno circuito");
        participante4 = new Participante(id,172153748,"Matheus","Reis",15, 1199998888
                , 11999998888L, 1166665555, 'O',categoria);
        criar = valorAPagar(participante4.getIdade(), participante4.getCategoria()) != 0;
        validaCriacao(criar, participante4);
        id++;

        categoria = criarCategoria(5,"circuito medio");
        participante5 = new Participante(id,172153748,"Jonatan","Santos",14, 1199998888
                , 11999998888L, 1166665555, 'O',categoria);
        criar = valorAPagar(participante5.getIdade(), participante5.getCategoria()) != 0;
        validaCriacao(criar, participante5);

    }

    public static void exibirCadastro(int key) {
        int i = 0;
        List<Participante> exibeParticipante = new ArrayList<>();
        while(i < participanteList.size()) {
            if (participanteList.get(i).getCategoria().containsKey(key)) {
                exibeParticipante.add(participanteList.get(i));
            }
            i++;
        }

        System.out.println("Encontrado os seguintes participantes na categoria " + key + ": " + exibeParticipante.toString());
    }

    public static void cancelarIncricao(int id) {
        System.out.println("Cancelado a inscricao do participante: " + participanteList.get(id).toString());
        participanteList.remove(id);
    }

    public static Double valorAPagar(int idade, HashMap<Integer, String> categoria) {
        double valorPagar = 0;

        if ((idade < 18) && (categoria.containsKey(2))){
            valorPagar = 1300;
        }else {
            if ((idade >= 18) && (categoria.containsKey(2))) {
                valorPagar = 1500;
            }
        }

        if ((idade < 18) && (categoria.containsKey(5))){
            valorPagar = 2000;
        }else {
            if ((idade >= 18) && (categoria.containsKey(5))) {
                valorPagar = 2300;
            }
        }

        if ((idade < 18) && (categoria.containsKey(10))) {
            valorPagar = 0;
        }else {
            if ((idade >= 18) && (categoria.containsKey(10))) {
                valorPagar = 2800;
            }
        }

        participante.setValorAPagar(valorPagar);

        return valorPagar;
    }

    public static void validaCriacao(boolean criar, Participante participante) {
        if (criar) {
            participanteList.add(participante);
            System.out.println("Criado participante: " + participante.toString() + " na categoria " + participante.getCategoria().toString());
        }else {
            System.out.println("Participante nao permitido na categoria!!!");
        }
    }

    public static HashMap<Integer, String> criarCategoria(Integer key, String descricao) {
        HashMap<Integer, String> categoria = new HashMap<>();
        categoria.put(key,descricao);
        return categoria;
    }
}
