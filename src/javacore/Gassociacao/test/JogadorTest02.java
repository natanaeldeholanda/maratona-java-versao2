package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Jogador;
import javacore.Gassociacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Natanael");
        Time time1 = new Time("Ceará");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
