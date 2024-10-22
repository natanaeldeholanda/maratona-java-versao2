package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Natanael";
        professor.idade = 37;
        professor.sexo = 'M';
        System.out.println(professor.toString());
    }
}
