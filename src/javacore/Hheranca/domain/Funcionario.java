package javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome){
        super(nome); //chamando o construtor da classe Pessoa
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Relatório de pagamento");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
}
