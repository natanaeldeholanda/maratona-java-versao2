package javacore.Kenum.test;

import javacore.Kenum.domain.Cliente;
import javacore.Kenum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Natanael", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.CARTAO_CREDITO);
        Cliente cliente2 = new Cliente("Holanda", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CARTAO_DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
