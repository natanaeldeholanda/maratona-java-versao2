package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideComReturn(20, 0);
        System.out.println(resultado);
        System.out.println(calculadora.divideComReturnDois(20, 2));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
    }
}
