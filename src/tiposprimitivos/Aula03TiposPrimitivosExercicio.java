package tiposprimitivos;

public class Aula03TiposPrimitivosExercicio {
    /*
    Prática
    Crie variáveis para os campos descritos abaixo entre <> e imprima a segunte mensagem:

    Eu <nome>, morando no endereco <endereço>,
    confirmo que recebi o salário de <salario>, na data<>.
     */

    public static void main(String[] args) {
        String nome = "Natanael de Holanda";
        String endereco = "Rua Grijalva Costa Número 480";
        double salario = 7500.99;
        String dataSalario = "22/03/2026";
        String relatorio = "Eu " + nome + ", morando no endereço: " + endereco + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataSalario + ".";
        System.out.println(relatorio);
    }
}
