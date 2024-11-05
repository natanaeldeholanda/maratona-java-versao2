package javacore.Hheranca.test;

import javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Holanda");
        /*
        0 -> Bloco de inicialização estático da superclasse é executado quando a JVM carregar a classe pai;
        1 -> Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha;
        2 -> Alocado espaço em memória pro objeto da casse pai;
        3 -> Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
        4 -> Bloco de inicialização da superclasse é executado na ordem em que aparece;
        5 -> Construtor é executado;
        6 -> Alocado espaço em memória pro objeto da subclasse;
        7 -> Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado;
        8 -> Bloco de inicialização da subclasse é executado na ordem em que aparece;
        9 -> Construtor é executado da subclasse;
         */
    }
}
