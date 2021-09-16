package atividadetarde.exerciciodois;

public class Main {

    public static void main(String[] args) {

        String palavra = "subi no onibus";
        String palavraInvertida = "";
        ManipulaStrings manipulaStrings = new ManipulaStrings();

        //Invertendo String
        palavraInvertida = manipulaStrings.inverterString(palavra);
        System.out.println(palavraInvertida);
        manipulaStrings.palindromo(palavra);

    }


}
