package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println("Adição: " + (10 + 10));
    }

    public void subtraiDoisNumeros() {
        System.out.println("Subtração: " + (10 - 5));
    }

    public void multiplicaDoisNumeros(double num1, double num2) {
        System.out.println("Multiplicação: " + (num1 * num2));
    }

    public void divideDoisNumeros(double num1, double num2) {
        System.out.println("Divisão: " + (num1 / num2));
    }

    public double divideComReturn(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideComReturnDois(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0");
            return; // Mesma coisa que o break, porém é usado nos métodos void
        }
        System.out.println(num1 / num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2) {
       numero1 = 99;
       numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + numero1);
        System.out.println("Num2: " + numero2);
    }
}
