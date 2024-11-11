package javacore.Npolimorfismo.service;

import javacore.Npolimorfismo.domain.Computador;
import javacore.Npolimorfismo.domain.Produto;
import javacore.Npolimorfismo.domain.Taxavel;
import javacore.Npolimorfismo.domain.Tomate;

public class CalculadoraImposto implements Taxavel {
    public static void calcularImposto(Produto produto) {
        System.out.println("---***---");
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        // foi feito o if para verificar se o produto é um tomate, se for, imprime a data de validade
        // se não, imprime o produto normalmente;
        if (produto instanceof Tomate) {
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println("Data Validade: " + dataValidade);
        }
    }

    @Override
    public double calcularImposto() {
        return 0;
    }
}
