package javacore.Npolimorfismo.domain;
public class Computador extends Produto {
    public static final double IMPOSTO_COMOPUTADOR = 0.25;
    private String dataCompra;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO_COMOPUTADOR;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
}

