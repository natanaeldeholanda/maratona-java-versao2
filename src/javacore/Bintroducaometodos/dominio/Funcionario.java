package javacore.Bintroducaometodos.dominio;

/*
Crie uma classe Funcionario com os seguintes atributos:
Nome
Idade
Salarios -> três salários devem ser guardados

Crie dois metodos:
1. Para imrimir os dados do funcionário
2. Para mostrar a média dos salarios e imprimir na tela
 */
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeDados(Funcionario funcionario) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.printf("Salario: R$%.2f\n", salario);
        }

        mediaSalarios(); // após o for, chamou o metodo para mostrar a média dos salarios, somente instanciando o
        //imprimeDados();
    }

    public void mediaSalarios() {
        if (this.salarios == null) {
            return;
        }
        double media = 0;

        for (double salario : salarios) {
            media += salario; // -> Média recebe ela mesma mais o valor do salario;

            media /= this.salarios.length; // -> Média recebe o valor da soma, e divide pela quantidade de salários;
        }
        System.out.printf("Media salarial: R$%.2f", media);
    }
}
