package javacore.Bintroducaometodos.test;
/*
Crie uma classe Funcionario com os seguintes atributos:
Nome
Idade
Salarios -> três salários devem ser guardados

Crie dois metodos:
1. Para imrimir os dados do funcionário
2. Para mostrar a média dos salarios e imprimir na tela
 */
import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Natanael";
        funcionario.idade = 37;
        funcionario.salarios = new double[]{7500, 9000, 11500};
        funcionario.imprimeDados(funcionario);
    }
}