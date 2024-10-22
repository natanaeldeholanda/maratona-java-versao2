package controlefluxo;

public class ControleFluxo02 {
    public static void main(String[] args) {
        int idade = 15;
        String status;
        status = idade < 18 ? "Nao adulto" : "adulto";
        System.out.println(status);
    }
}
