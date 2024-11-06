package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.domain.Desenvolvedor;
import javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Hernando Dourado", 10500);
        System.out.println(gerente);
        Desenvolvedor desenvolvedorJavaJunior = new Desenvolvedor("Natanael", 7500);
        System.out.println(desenvolvedorJavaJunior);
    }
}
