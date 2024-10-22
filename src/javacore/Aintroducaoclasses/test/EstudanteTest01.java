package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Natanael";
        estudante.idade = 37;
        estudante.sexo = 'M';
        System.out.println(estudante.toString());
    }
}
