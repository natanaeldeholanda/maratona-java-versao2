package estruturascondicionais;

public class EstruturaIf {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (idade >= 18) {
            System.out.println("Aurotizado a comprar bebida alcoólica!");
        }
        //!, pode ser usado com == (comparação)
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Aurotizado a comprar bebida alcoólica!");
        }
    }
}
