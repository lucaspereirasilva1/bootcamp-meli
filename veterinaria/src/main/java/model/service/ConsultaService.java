package model.service;

import model.entity.Consulta;
import model.entity.Medico;
import model.entity.Paciente;

import java.time.LocalDateTime;

public class ConsultaService {

    Consulta consulta;

    public void cadastrarConsulta(LocalDateTime dataHora, String motivo, String diagnostico, String tratamento
            , Medico medico, Paciente paciente) {
        consulta = new Consulta(dataHora, motivo, diagnostico, tratamento, medico, paciente);
    }

}
