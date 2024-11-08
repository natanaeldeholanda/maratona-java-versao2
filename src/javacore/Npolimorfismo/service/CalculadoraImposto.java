package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.domain.Computador;

public class CalculadoraImposto {
    public void calcularImpostoComputador(Computador computador) {
        System.out.println("---***---");
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }


}
