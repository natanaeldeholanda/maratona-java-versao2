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
}
