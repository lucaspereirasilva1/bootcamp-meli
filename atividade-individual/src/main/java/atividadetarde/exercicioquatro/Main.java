package atividadetarde.exercicioquatro;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static BufferedWriter bw;
    static BufferedReader br;

    public static void main(String[] args) {

        List<String[]> listaNomes = new ArrayList<>();
        List<String> novaLista = new ArrayList<>();

        arquivoUtil("nomes.txt");

        //Carregando arquivo
        try {
            listaNomes = retornaRegistros();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Transformando array de string em lista
        for (String[] listaNome : listaNomes) {
            novaLista.addAll(Arrays.asList(listaNome));
        }

        System.out.println("---------Lista Carregada---------");
        novaLista.forEach(System.out::println);

        System.out.println("---------Lista Ordenada---------");
        List<String> novalistaOrdernada = novaLista.stream()
                .sorted()
                .collect(Collectors.toList());
        novalistaOrdernada.forEach(System.out::println);

        //Gravando nova lista ordenada
        arquivoUtil("nomes-ordenados.txt");
        novalistaOrdernada.forEach(l -> {
            try {
                escreve(l);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        fechaArquivo();

    }

    public static void arquivoUtil(String caminho){
        File file = new File(caminho);
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream(file, true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao conectar ao arquivo");
        }
    }

    public static void escreve(String registro) throws IOException{
        bw.append(registro);
        bw.newLine();
    }

    public static void fechaArquivo(){
        try {
            bw.close();
        }catch(IOException e) {
            System.out.println("Nao funcionou");
        }

    }

    public static List<String[]> retornaRegistros() throws IOException {
        List<String[]> registros = new ArrayList<>();
        while(true) {
            String linha = br.readLine();
            if(linha==null) {
                break;
            }
            String[] campos = linha.split(";");
            registros.add(campos);
        }
        return registros;
    }

}
