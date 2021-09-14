import model.service.ConsultaService;
import model.service.MedicoService;
import model.service.ProprietarioService;
import util.ArquivoUtil;
import util.ProprietarioDAO;

import java.time.LocalDate;

public class Main2 {
    public static void main(String[] args) {

        LocalDate dataNascimento = LocalDate.now();
        ProprietarioService proprietarioService = new ProprietarioService();
        //Proprietario 1
        proprietarioService.cadastrarPropietario(12334567890L, "lucas", "pereira", dataNascimento, "rua zero",11988886666L);
        System.out.println(proprietarioService.getProprietario().toString());

        //Proprietario 2
        proprietarioService.cadastrarPropietario(90809845621L, "jhoony", "silva", dataNascimento, "rua dois",11988885555L);
        System.out.println(proprietarioService.getProprietario().toString());

        //Proprietario 3
        proprietarioService.cadastrarPropietario(12545345689L, "mauri", "dos reis", dataNascimento, "rua tres",11988883333L);
        System.out.println(proprietarioService.getProprietario().toString());
    }
}
