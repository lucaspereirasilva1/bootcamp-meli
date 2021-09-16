package atividadetarde.exerciciodois;

import java.util.Locale;

public class ManipulaStrings {


    public String inverterString(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString().toUpperCase(Locale.ROOT);
    }

    public void palindromo(String palavra) {
        StringBuilder sb = new StringBuilder(palavra);
        String palavraInvertida = sb.reverse().toString();
        String palavraSemEspaco = palavra.replaceAll("\\s+", "");
        String palavraInvertidaSemEspaco = palavraInvertida.replaceAll("\\s+", "");

        if(palavraSemEspaco.equals(palavraInvertidaSemEspaco)) {
            System.out.println("e palindromo");
        }else {
            System.out.println("nao e palindromo");
        }
    }
}
