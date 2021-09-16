package atividadetarde.exerciciotres;

public class Retangulo {

    public double calculaArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }

    public double calculaPerimetro(double ladoA, double ladoB) {
        return (ladoA + ladoB) * 2;
    }

    public double calcularQuantidadePiso(double areaLajota, double areaTotal) {
        return areaTotal/areaLajota;
    }

    public double calcularQuantidadeRodape(double comprimentoLoja, double perimetro) {
        return perimetro/comprimentoLoja;
    }
}
