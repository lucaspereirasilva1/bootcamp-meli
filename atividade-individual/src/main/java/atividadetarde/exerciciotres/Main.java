package atividadetarde.exerciciotres;

public class Main {

    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();

        //Calcular area retangulo
        System.out.println("------------------calculaArea------------------");
        double area = retangulo.calculaArea(2.0, 2.0);
        System.out.println("area calculada e de: " + area);

        //Calcular perimetro retangulo
        System.out.println("------------------calculaPerimetro------------------");
        double perimetro = retangulo.calculaPerimetro(2.0, 2.0);
        System.out.println("perimetro calculada e de: " + perimetro);

        //Calulcar quantidade piso
        System.out.println("------------------calcularQuantidadePiso------------------");
        double quantidadePiso = retangulo.calcularQuantidadePiso(4.0, area);
        System.out.println("areo lajota e de: "+ quantidadePiso);

        //Calcular quantidade rodape
        System.out.println("------------------calcularQuantidadeRodape------------------");
        double quantidadeRodape = retangulo.calcularQuantidadeRodape(2.0, perimetro);
        System.out.println("quantidade rodape: " + quantidadeRodape);

    }

}
