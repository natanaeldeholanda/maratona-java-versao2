package javacore.Jmodificadorfinal.domain;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    /*
    OUTRA FORMA DE DECLARAR UMA CONSTANTE;
    static {
        VELOCIDADE_LIMITE = 250;
    }
     */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public final void imprime(){
        System.out.println(this.getNome());
        System.out.println("Método Final da Classe Carro");
    }
}
