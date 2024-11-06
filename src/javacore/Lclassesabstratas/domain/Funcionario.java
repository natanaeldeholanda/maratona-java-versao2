package javacore.Lclassesabstratas.domain;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcularBonificacao();
    }

    public abstract void calcularBonificacao();

    @Override
    public void imprime() {
        System.out.println("Implementei o método da classe Pessoa em Funcionário");
    }
}

