package javacore.Gassociacao.test;

import javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Natanael");
        Jogador jogador2 = new Jogador("Pelé");
        Jogador jogador3 = new Jogador("Vini Jr");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
