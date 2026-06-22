package estruturascondicionais;

public class Operadores {
    //OPERADORES RELACIONAIS / LÓGICOS
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);
        // % -> Resto
        int resto = 20 % 2;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte: " +  isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " +  isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte: " +  isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte: " +  isDezDiferenteQueVinte);
        System.out.println("isDezMaiorIgualQueVinte: " +  isDezMaiorIgualVinte);
        System.out.println("isDezMenorIgualQueVinte: " +  isDezMenorIgualVinte);
    }
}
