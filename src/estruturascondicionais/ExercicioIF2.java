package estruturascondicionais;

public class ExercicioIF2 {
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa; // Pode ser assim
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa; // Pode ser assim também
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("O imposto descontado é de U$$" + valorImposto);
        System.out.println("E o salário anual ficará em U$$ " + (salarioAnual - valorImposto));
    }
}
