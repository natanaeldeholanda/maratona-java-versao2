package javacore.Isobrescrita.domain;

public class Anime {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime: " +
                "Nome ='" + nome + '\'';
    }
}
