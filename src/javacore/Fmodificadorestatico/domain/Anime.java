package javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /*
    0 -> Bloco de inicialização é executado quando a JVM carregar a classe;
    1 -> Alocado espaço em memória pro objeto;
    2 -> Cada atributo de classe é criado e inicializado com os valores
    default ou o que o for passar;
    3 -> Bloco de inicialização é executado;
    4 -> Construtor é executado;
     */
    static { // Quando utiliza static no bloco de inicialização, o mesmo é executado
        // apenas uma vez
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do segundo bloco de inicialização");
    }
    {
        System.out.println("Dentro de um bloco de inicialização não static");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
