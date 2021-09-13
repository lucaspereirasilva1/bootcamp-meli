package model.service;

import model.entity.Consulta;
import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ConsultaService {

    private Consulta consulta;
    private MedicoService medicoService = new MedicoService();
    private List<Consulta> listaConsultas = new ArrayList<>();
    private LocalDateTime dataHora = LocalDateTime.now();
    private LocalDate dataNascimento = LocalDate.now();

    public Consulta getConsulta() {
        return consulta;
    }

    public List<Consulta> getListaConsultas() {
        return listaConsultas;
    }

    public void cadastrarConsulta(LocalDateTime dataHora, String motivo, String diagnostico, String tratamento
            , Medico medico, Paciente paciente) {
        consulta = new Consulta(dataHora, motivo, diagnostico, tratamento, medico, paciente);
    }

    public void criarListaConsulta(Consulta consulta) {
        listaConsultas.add(consulta);
    }

    public List<String> listarTotalConsultasMedicos(List<Medico> listaMedicos) {
        List<String> consultaPorMedico = new ArrayList<>();

        for (Medico m : listaMedicos) {
            String retorno = m.getNome();
            int contador = 0;
            for (Consulta c : this.getListaConsultas()) {
                if (m.getCpf() == c.getMedico().getCpf()) {
                    contador++;
                }
            }
            retorno = retorno + " " + contador;
            consultaPorMedico.add(retorno);
        }

        return consultaPorMedico;
    }


    public List<Consulta> listarConsultasPorPacientes(Paciente paciente) {
        List<Consulta> retornolistaConsulta = new ArrayList<>();
        for (Consulta c : this.getListaConsultas()) {
            if (c.getPaciente().getEspecie().equals(paciente.getEspecie())) {
//                System.out.println(c.toString());
                retornolistaConsulta.add(c);
            }
        }

        return retornolistaConsulta;
    }
}
