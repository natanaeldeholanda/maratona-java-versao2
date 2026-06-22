package estruturascondicionais;

public class OperadorTernario {
    public static void main(String[] args) {
        //Doar salário > 5000
        double salario = 6500;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 7500 ? mensagemDoar : mensagemNaoDoar;
        String resultado2 = salario > 7500 ? "Eu vou doar 600 pro DevDojo" : "Ainda não tenho condições de doar, mas terei!";
        System.out.println(resultado);
        System.out.println(resultado2);


        String categoria;
        int idade = 17;
        // Não aconcelhável!!!
        categoria = idade < 15 ? "Categoria infantil" : idade >= 16 && idade < 18 ? "Categoria Jovenil" : "Categoria adulto";
        System.out.println(categoria);

    }
}
