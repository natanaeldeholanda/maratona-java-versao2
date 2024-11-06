package javacore.Kenum.test;

import javacore.Kenum.domain.Cliente;
import javacore.Kenum.domain.TipoCliente;
import javacore.Kenum.domain.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
      Cliente cliente1 = new Cliente("Natanael", TipoCliente.PESSOA_FISICA, TipoPagamento.CARTAO_CREDITO);
      Cliente cliente2 = new Cliente("Holanda", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CARTAO_DEBITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CARTAO_DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CARTAO_CREDITO.calcularDesconto(100));
        TipoCliente pessoaJuridica = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(pessoaJuridica.getNomeRelatorio());
        TipoCliente pessoaFisica = TipoCliente.tipoClienteNomeRelatorio("Pessoa Física");
        System.out.println(pessoaFisica);


    }
}
