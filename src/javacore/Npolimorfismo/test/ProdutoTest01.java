package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", 6500);
        Tomate tomate = new Tomate("Tomate Verde", 2.5);
        CalculadoraImposto.calcularImpostoComoutador(computador);
        System.out.println("-------------------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
