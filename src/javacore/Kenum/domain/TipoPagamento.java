package javacore.Kenum.domain;

public enum TipoPagamento {
    /*
    -> Declaramos o metodo calcularDesconto(double valor), só retornando 0 para iniciar o metodo;
    -> Depois fizemos a sobrescrita do metodo, uma pra CARTAO_DEBITO e outra pra CARTAO_CREDITO;
    -> Cada um dos metodos vai retornar um valor diferente;
    -> Dependendo do tipo de pagamento;
     */
    CARTAO_DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.10);
        }
    },
    CARTAO_CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor - (valor * 0.05);
        }
    };

    public abstract double calcularDesconto(double valor);
    //Declaração do metodo abstrato, serve pra logica sobrescrever e dizer o que vai ser feito, de acordo com o caso;
}
