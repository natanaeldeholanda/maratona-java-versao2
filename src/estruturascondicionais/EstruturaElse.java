package estruturascondicionais;

public class EstruturaElse {
    public static void main(String[] args) {
        // idade < 15 -> Categoria infantil
        // idade >= 15 && idade < 18 -> Categoria juvenil
        // idade >=18 -> Categoria adulto

        int idade = 13;
        String categoria;
        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
