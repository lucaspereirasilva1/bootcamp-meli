package com.example.springweb.controller.praticaintegradamorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {

    @GetMapping("convertmorse/{param}")
    public String morseRequest(@PathVariable String param) {

        StringBuilder retorno = new StringBuilder();

        for (int i = 0; i < param.length(); i++) {
            switch (Character.toUpperCase(param.charAt(i))) {
                case 'A':
                    retorno.append(".- ");
                    continue;
                case 'B':
                    retorno.append("-... ");
                    continue;
                case 'C':
                    retorno.append("-.-. ");
                    continue;
                case 'D':
                    retorno.append("-.. ");
                    continue;
                case 'E':
                    retorno.append(". ");
                    continue;
                case 'F':
                    retorno.append("..-. ");
                    continue;
                case 'G':
                    retorno.append("--. ");
                    continue;
                case 'H':
                    retorno.append(".... ");
                    continue;
                case 'I':
                    retorno.append(".. ");
                    continue;
                case 'J':
                    retorno.append(".--- ");
                    continue;
                case 'K':
                    retorno.append("-.- ");
                    continue;
                case 'L':
                    retorno.append(".-.. ");
                    continue;
                case 'M':
                    retorno.append("-- ");
                    continue;
                case 'N':
                    retorno.append("-. ");
                    continue;
                case 'O':
                    retorno.append("--- ");
                    continue;
                case 'P':
                    retorno.append(".--. ");
                    continue;
                case 'Q':
                    retorno.append("--.- ");
                    continue;
                case 'R':
                    retorno.append(".-. ");
                    continue;
                case 'S':
                    retorno.append("... ");
                    continue;
                case 'T':
                    retorno.append("- ");
                    continue;
                case 'U':
                    retorno.append("..- ");
                    continue;
                case 'V':
                    retorno.append("...- ");
                    continue;
                case 'W':
                    retorno.append(".-- ");
                    continue;
                case 'X':
                    retorno.append("-..- ");
                    continue;
                case 'Y':
                    retorno.append("-.-- ");
                    continue;
                case 'Z':
                    retorno.append("--.. ");
                    continue;
                case '0':
                    retorno.append("----- ");
                    continue;
                case '1':
                    retorno.append(".--- ");
                    continue;
                case '2':
                    retorno.append("..--- ");
                    continue;
                case '3':
                    retorno.append("...-- ");
                    continue;
                case '4':
                    retorno.append("....- ");
                    continue;
                case '5':
                    retorno.append("..... ");
                    continue;
                case '6':
                    retorno.append("-.... ");
                    continue;
                case '7':
                    retorno.append("--... ");
                    continue;
                case '8':
                    retorno.append("---.. ");
                    continue;
                case '9':
                    retorno.append("----. ");
                    continue;

                    // O espaco em branco nao consta no codigo Morse.
                    // No codigo, o espaco em branco eh representado
                    //    por um intervalo de tempo sem transmissao de
                    //    informacoes.
                case ' ':
                    retorno.append("   ");
                    continue;

                default: // Caracter nao suportado
                    break;
            }
            return retorno.toString();
        }
        return retorno.toString();
    }

}
