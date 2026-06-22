package estruturascondicionais;

public class ExercicioIF {
    public static void main(String[] args) {
        double salario = 68508;
        double salarioOperadorTernario = 7500;

        if (salario > 0 && salario <= 34712){
            System.out.println("Irei pagar 9.70% de imposto");
        } else if (salario >= 34713 && salario <= 68507) {
            System.out.println("Irei pagar 37.35% de imposto");
        } else {
            System.out.println("Irei pagar 49.50% de imposto");
        }

        String categoriaTernarioResultado;
        categoriaTernarioResultado = salarioOperadorTernario > 0 && salarioOperadorTernario <= 34712 ? "Irei pagar 9.70% de imposto" : salarioOperadorTernario >= 34713 && salarioOperadorTernario <= 68507 ? "Irei pagar 37.35% de imposto" : "Irei pagar 49.50% de imposto";
        System.out.println("\n" + categoriaTernarioResultado);
    }
}
