package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Natanael");
        pessoa.setIdade(70);
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
        pessoa.imprime();
    }
}
