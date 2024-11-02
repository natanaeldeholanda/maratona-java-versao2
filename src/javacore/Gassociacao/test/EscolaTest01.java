package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Escola;
import javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Mestre Kami");
        Professor[] professores = {professor1, professor2};
        Escola escola1 = new Escola("Unecim", professores);
        escola1.imprime();
    }
}
