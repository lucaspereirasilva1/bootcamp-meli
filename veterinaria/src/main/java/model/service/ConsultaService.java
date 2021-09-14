package model.service;

import model.entity.Consulta;
import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;
import util.ConsultaDAO;
import util.ProprietarioDAO;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultaService {

    private Consulta consulta;
    private List<Consulta> listaConsultas = new ArrayList<>();

    public Consulta getConsulta() {
        return consulta;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void cadastrarConsulta(LocalDateTime dataHora, String motivo, String diagnostico, String tratamento
            , Medico medico, Paciente paciente) {
        consulta = new Consulta(listaConsultas.size(), dataHora, motivo, diagnostico, tratamento, medico, paciente);
        ConsultaDAO consultaDAO = new ConsultaDAO("consulta.txt");
        consultaDAO.salva(consulta);
        consultaDAO.fechar();
    }

    public void adicionarListaConsulta(Consulta consulta) {
        listaConsultas.add(consulta);
    }

    public List<String> listarTotalConsultasMedicos(List<Medico> listaMedicos) {
        List<String> consultaPorMedico = new ArrayList<>();

        for (Medico m : listaMedicos) {
            String retorno = m.getNome();
            int contador = 0;
            for (Consulta c : this.getListaConsultas()) {
                if (m.getCpf().equals(c.getMedico().getCpf())) {
                    contador++;
                }
            }
            retorno = retorno + " " + contador;
            consultaPorMedico.add(retorno);
        }

        return consultaPorMedico;
    }

    public List<Consulta> listarConsultasPorPacientes(Paciente paciente) {
        List<Consulta> retornoListaConsultas;
        retornoListaConsultas = getListaConsultas().stream()
                .filter(p -> p.getPaciente().getEspecie().equals(paciente.getEspecie()))
                .collect(Collectors.toList());
        retornoListaConsultas.sort((Consulta c1, Consulta c2) -> c2.getDataHora().compareTo(c1.getDataHora()));
        return retornoListaConsultas;
    }

    public List<Consulta> listarConsultasPorDia(LocalDate dia) {
        List<Consulta> retornoListaConsultas;
        retornoListaConsultas = getListaConsultas().stream()
                .filter(c -> c.getDataHora().getDayOfMonth() == dia.getDayOfMonth())
                .filter(c -> c.getDataHora().getMonth() == dia.getMonth())
                .filter(c -> c.getDataHora().getYear() == dia.getYear())
                .collect(Collectors.toList());
        retornoListaConsultas.sort((Consulta c1, Consulta c2) -> c1.getDataHora().compareTo(c2.getDataHora()));
        return retornoListaConsultas;
    }

    public List<Consulta> carregarConsultaArquivo() {
        ConsultaDAO consultaDAO = new ConsultaDAO("consulta.txt");
        List<String[]> lista = consultaDAO.carregarArquivo();

        List<Consulta> listaConsulta = new ArrayList<>();
        for (String[] s:lista) {
            Consulta consulta = new Consulta();
            Integer id = Integer.valueOf(s[0]);
            consulta.setId(id);
            consulta.setDiagnostico(s[1]);
            consulta.setTratamento(s[2]);
            consulta.setMotivo(s[3]);
            listaConsulta.add(consulta);
        }
        return listaConsulta;
    }
}
