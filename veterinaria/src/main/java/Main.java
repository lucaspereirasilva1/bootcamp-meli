import model.entity.Consulta;
import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;
import model.service.MedicoService;
import model.service.ProprietarioService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();

        MedicoService medicoService = new MedicoService();
        medicoService.cadastrarMedicos(123, "lucas", "pereira", "animais domesticos");
        System.out.println(medicoService.exibirMedico());

        ProprietarioService proprietarioService = new ProprietarioService();
        proprietarioService.cadastrarPropietario(123, "lucas", "pereira", dataNascimento, "rua zero",11988887777L);
        System.out.println(proprietarioService.exibirProprietario());

//        Paciente paciente = new Paciente();
//        paciente.cadastarPaciente("cachorro", "vira-lata", "preto", dataNascimento, "rex", proprietario, "domestico ");
//        System.out.println(paciente);

//        Consulta consulta = new Consulta();
//        consulta.cadastrarConsulta(dataHora, "rotina", "paciente sem problemas", "nenhum", medico, paciente);
//        System.out.println(consulta);

//        List<Consulta> listaConsulta = new ArrayList<>();
//        listaConsulta.add(consulta);

//        consulta.listarConsultasPorPacientes();
    }
}
