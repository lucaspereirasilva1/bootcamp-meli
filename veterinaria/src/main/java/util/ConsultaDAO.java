package util;

import model.entity.Consulta;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConsultaDAO implements Persistivel<Consulta>{

    private File file;
    private ArquivoUtil arquivoUtil;

    public ConsultaDAO(String arquivo) {
        file = new File(arquivo);
        arquivoUtil = new ArquivoUtil(file);
    }

    @Override
    public void salva(Consulta consulta) {
        String registro = consulta.getId() + ";" + consulta.getDiagnostico() + ";" + consulta.getTratamento() + ";" + consulta.getMotivo();
        try {
            arquivoUtil.escreve(registro);
            arquivoUtil.fechaArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void salva(List<Consulta> lista) {

    }

    @Override
    public Consulta obter(String id) {
        return null;
    }

    @Override
    public List<Consulta> listagem() {
        return null;
    }

    @Override
    public void fechar() {

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
