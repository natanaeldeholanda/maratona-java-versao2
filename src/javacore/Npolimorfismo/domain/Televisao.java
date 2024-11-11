package javacore.Npolimorfismo.domain;

public class Televisao extends Produto {
    public static final double IMPOSTO_TELEVISAO = 0.14;

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.valor * IMPOSTO_TELEVISAO;
    }

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
}
