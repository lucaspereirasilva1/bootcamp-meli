import model.entity.Consulta;
import model.entity.Medico;
import model.entity.Paciente;
import model.entity.Proprietario;
import model.service.ConsultaService;
import model.service.MedicoService;
import model.service.PacienteService;
import model.service.ProprietarioService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.now();
        LocalDateTime dataHora = LocalDateTime.now();
        PacienteService pacienteService = new PacienteService();
        ProprietarioService proprietarioService = new ProprietarioService();
        MedicoService medicoService = new MedicoService();
        ConsultaService consultaService = new ConsultaService();

        //Proprietario 1
        proprietarioService.cadastrarPropietario(123, "lucas", "pereira", dataNascimento, "rua zero",11988886666L);
        proprietarioService.criarListaProprietario(proprietarioService.getProprietario());

        //Proprietario 2
        proprietarioService.cadastrarPropietario(908, "jhoony", "silva", dataNascimento, "rua dois",11988885555L);
        proprietarioService.criarListaProprietario(proprietarioService.getProprietario());

        //Proprietario 3
        proprietarioService.cadastrarPropietario(545, "mauri", "dos reis", dataNascimento, "rua tres",11988883333L);
        proprietarioService.criarListaProprietario(proprietarioService.getProprietario());

        //Paciente 1
        pacienteService.cadastarPaciente("cachorro", "vira-lata", "preto", dataNascimento, "rex", proprietarioService.getListaProprietario().get(0) , "animal domestico");
        pacienteService.criarListaPaciente(pacienteService.getPaciente());

        //Paciente 2
        pacienteService.cadastarPaciente("gato", "vira-lata", "branco", dataNascimento, "toddy", proprietarioService.getListaProprietario().get(1), "animal domestico");
        pacienteService.criarListaPaciente(pacienteService.getPaciente());

        //Paciente 3
        pacienteService.cadastarPaciente("rato", "vira-lata", "marrom", dataNascimento, "joao", proprietarioService.getListaProprietario().get(2), "animal domestico");
        pacienteService.criarListaPaciente(pacienteService.getPaciente());
        pacienteService.getListaPaciente().forEach(f -> System.out.println(f.toString()));

        //Cadastrar medicos
        medicoService.cadastrarMedicos(321, "ed", "nobre", "animais domesticos");
        medicoService.criarListaMedico(medicoService.getMedico());
        medicoService.cadastrarMedicos(456, "rafael", "ferreira", "animais domesticos");
        medicoService.criarListaMedico(medicoService.getMedico());

        //Consulta 1
        consultaService.cadastrarConsulta(dataHora, "exames", "colesterol alto", "remedio", medicoService.getListaMedico().get(0), pacienteService.getListaPaciente().get(0));
        consultaService.criarListaConsulta(consultaService.getConsulta());

        //Consulta 2
        consultaService.cadastrarConsulta(dataHora, "exames", "colesterol alto", "remedio", medicoService.getListaMedico().get(1), pacienteService.getListaPaciente().get(1));
        consultaService.criarListaConsulta(consultaService.getConsulta());

        //Consulta 3
        consultaService.cadastrarConsulta(dataHora, "exames", "colesterol alto", "remedio", medicoService.getListaMedico().get(1), pacienteService.getListaPaciente().get(2));
        consultaService.criarListaConsulta(consultaService.getConsulta());

        //ListarPacientesPropretarios
        pacienteService.listarPacienteProprietarios(pacienteService.getListaPaciente());
        System.out.println("---------listarPacientesPropretarios---------");
        for (Paciente p: pacienteService.getListaPaciente()) {
            System.out.println(p.toString());
        }

        //ListarTotalConsultasMedicos
        System.out.println("---------listarTotalConsultasMedicos---------");
        List<String> consultaPorMedico = consultaService.listarTotalConsultasMedicos(medicoService.getListaMedico());
        for (String s : consultaPorMedico) {
            System.out.println(s);
        }

        //ListarConsultasPorPaciente
        System.out.println("---------listarConsultasPorPaciente---------");
//        List<Paciente> pacientes = consultaService.listarConsultasPorPacientes(pacienteService.getListaPaciente().get(0).getId());
        List<Consulta> consultaPorPaciente = consultaService.listarConsultasPorPacientes(pacienteService.getListaPaciente().get(0));
        consultaPorPaciente.forEach(System.out::println);









//        for (Medico m: medicoService.getListaMedico()) {
//            String retorno = m.getNome();
//            int contador = 0;
//            for (Consulta c: consultaService.getListaConsultas()) {
//                if(m.getCpf() == c.getMedico().getCpf()) {
//                    contador++;
//                }
//            }

//            System.out.println(retorno += contador);

//        for (Consulta c: consultaService.listarTotalConsultasMedicos(consultaService.getListaConsultas())) {
//
//        }



//        MedicoService medicoService = new MedicoService();
//        List<Medico> listaMedico = medicoService.criarListaMedico();
//        medicoService.listarTotalConsultasMedicos(listaMedico);
//
//        for (Medico m:
//                listaMedico) {
//            System.out.println(medico.getNome() + medico.consulta.size());
//        }


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