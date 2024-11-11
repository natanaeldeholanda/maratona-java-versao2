package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Televisao;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell", 2000);
        Tomate tomate = new Tomate("Tomate verde", 20);
        Televisao televisao = new Televisao("Samsung 50\" ", 3000);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(televisao);
    }
}

