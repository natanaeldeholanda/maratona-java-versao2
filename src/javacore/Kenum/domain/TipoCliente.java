package javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatório;

    TipoCliente(int valor, String nomeRelatório) {
        this.VALOR = valor;
        this.nomeRelatório = nomeRelatório;
    }

    public String getNomeRelatorio() {
        return nomeRelatório;
    }
}

