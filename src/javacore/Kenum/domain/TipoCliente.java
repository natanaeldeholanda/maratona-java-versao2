package javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}

