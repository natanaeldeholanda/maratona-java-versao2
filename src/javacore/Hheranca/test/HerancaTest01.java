package javacore.Hheranca.test;

import javacore.Hheranca.domain.Endereco;
import javacore.Hheranca.domain.Funcionario;
import javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345-678");
        Pessoa pessoa = new Pessoa("Natanael");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario funcionario = new Funcionario("Oliveira");
        funcionario.setCpf("123.456.789-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(7500);
        System.out.println("------------");
        funcionario.imprime();
    }
}
