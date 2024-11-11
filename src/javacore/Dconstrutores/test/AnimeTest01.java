package javacore.Dconstrutores.test;
//Aula 58 - Orientação Objetos - Construtores pt 01

import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "Anime", 10, "Seinen");
        Anime anime2 = new Anime(); // Criando através do contrutor que o java cria automaticamente;
        anime.imprime();
    }
}
