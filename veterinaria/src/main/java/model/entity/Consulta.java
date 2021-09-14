package model.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class Consulta {

    private LocalDateTime dataHora;
    private String motivo;
    private String diagnostico;
    private String tratamento;
    private Medico medico;
    private Paciente paciente;
    private int id;

    public Consulta() {
    }

    public Consulta(int id, LocalDateTime dataHora, String motivo, String diagnostico, String tratamento, Medico medico
            , Paciente paciente) {
        this.dataHora = dataHora;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
        this.medico = medico;
        this.paciente = paciente;
        this.id = id;
    }
}
