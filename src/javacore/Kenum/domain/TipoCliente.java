package javacore.Kenum.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int valor;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    //Metodo para buscar o tipo de cliente pelo nome relatorio.
    public static TipoCliente tipoClienteNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : TipoCliente.values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }


    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}

