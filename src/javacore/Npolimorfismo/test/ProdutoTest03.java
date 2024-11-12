package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Televisao;
import javacore.Npolimorfismo.domain.Tomate;
import javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen 9", 4000);
        Tomate tomate = new Tomate("Tomate", 10);
        Produto televisao = new Televisao("Televisão", 2000);
        computador.setDataCompra("14/12/2024");
        tomate.setDataValidade("10/11/2021");

        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(computador);
        CalculadoraImposto.calcularImposto(televisao);

    }
}

