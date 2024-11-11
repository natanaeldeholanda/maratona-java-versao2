package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComoutador(Computador computador) {
        System.out.println("Relatório de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do Computador: " + computador.getNome());
        System.out.println("Valor do Computador: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de Imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do Tomate: " + tomate.getNome());
        System.out.println("Valor do Tomate: " + tomate.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
