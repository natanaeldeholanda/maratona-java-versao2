package javacore.Lclassesabstratas.domain;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonificacao() {
        this.salario += this.salario * 0.30;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} ";
    }

    @Override
    public void imprime() {
        System.out.println("Implementei o método da classe Pessoa em Gerente");
    }
}
