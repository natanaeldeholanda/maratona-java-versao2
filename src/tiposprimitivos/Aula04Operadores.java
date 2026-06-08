package tiposprimitivos;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultadoSoma = numero01 + numero02;
        int resultadoDivisao = numero02 / numero01;
        int resultadoMultiplicacao = numero02 * numero01;
        int resultadoSubtracao = numero02 - numero01;
        System.out.println(resultadoSoma);
        System.out.println(resultadoSubtracao);
        System.out.println(resultadoMultiplicacao);
        System.out.printf(String.valueOf(resultadoDivisao));
    }
}
