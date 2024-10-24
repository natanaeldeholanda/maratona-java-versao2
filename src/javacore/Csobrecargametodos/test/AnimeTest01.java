package javacore.Csobrecargametodos.test;
//Aula 57 - Orientação Objetos - Sobrecarga de métodos

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Anime", 500, "Seinen");
        anime.imprime();
    }
}
