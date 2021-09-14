package util;

import model.entity.Proprietario;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ProprietarioDAO implements Persistivel<Proprietario> {

    private File file;
    private ArquivoUtil arquivoUtil;

    public ProprietarioDAO(String arquivo) {
        file = new File(arquivo);
        arquivoUtil = new ArquivoUtil(file);
    }

    @Override
    public void salva(Proprietario proprietario) {
        String registro = proprietario.getCpf() + ";" + proprietario.getNome() + ";" + proprietario.getSobreNome();
        try {
            arquivoUtil.escreve(registro);
            arquivoUtil.fechaArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salva(List<Proprietario> lista) {

    }

    @Override
    public Proprietario obter(String id) {
        return null;
    }

    @Override
    public List<Proprietario> listagem() {
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
