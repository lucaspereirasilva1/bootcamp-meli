package util;

import model.entity.Medico;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MedicoDAO implements Persistivel<Medico>{

    private File file;
    private ArquivoUtil arquivoUtil;

    public MedicoDAO(String arquivo) {
        file = new File(arquivo);
        arquivoUtil = new ArquivoUtil(file);
    }

    @Override
    public void salva(Medico medico) {
        String registro = medico.getNumeroRegistro()+ ";" + medico.getCpf() + ";" + medico.getNome() + ";" + medico.getEspecialidade();
        try {
            arquivoUtil.escreve(registro);
            arquivoUtil.fechaArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salva(List<Medico> lista) {

    }

    @Override
    public Medico obter(String id) {
        return null;
    }

    @Override
    public List<Medico> listagem() {
        return null;
    }

    @Override
    public void fechar() {
        arquivoUtil.fechaArquivo();
    }

    @Override
    public List<String[]> carregarArquivo() {
        try {
            return arquivoUtil.retornaRegistros();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
