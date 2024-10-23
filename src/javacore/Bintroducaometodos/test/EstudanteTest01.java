package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Natanael";
        estudante01.sexo = 'M';
        estudante01.idade = 37;
        estudante02.nome = "Katia";
        estudante02.sexo = 'F';
        estudante02.idade = 30;

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        System.out.println("#######################");
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
    }
}
