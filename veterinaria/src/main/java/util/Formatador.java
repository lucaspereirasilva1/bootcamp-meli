package util;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Formatador {

    public String formatarCPF(String cpf) {
        String mascara = "###.###.###-##";
        try {
            MaskFormatter maskFormatter = new MaskFormatter(mascara);
            maskFormatter.setValueContainsLiteralCharacters(false);
            return maskFormatter.valueToString(cpf);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }
}
