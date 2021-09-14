package util;

import model.entity.Paciente;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PacienteDAO implements Persistivel<Paciente> {

    private File file;
    private ArquivoUtil arquivoUtil;

    public PacienteDAO(String arquivo) {
        file = new File(arquivo);
        arquivoUtil = new ArquivoUtil(file);
    }

    @Override
    public void salva(Paciente paciente) {
        String registro = paciente.getId() + ";" + paciente.getNome() + ";" + paciente.getEspecie();
        try {
            arquivoUtil.escreve(registro);
            arquivoUtil.fechaArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salva(List<Paciente> lista) {

    }

    @Override
    public Paciente obter(String id) {
        return null;
    }

    @Override
    public List<Paciente> listagem() {
        return null;
    }

    @Override
    public void fechar() {
        arquivoUtil.fechaArquivo();
    }

    @Override
    public List<String[]> carregarArquivo(){

        try {
            return arquivoUtil.retornaRegistros();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
