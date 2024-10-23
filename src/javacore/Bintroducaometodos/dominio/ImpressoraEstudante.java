package javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("-----------------------");
        // Quando altera algo no objeto, dá impacto em todos os parâmetros
        // que estiverem dentro do objeto
        estudante.nome = "Gohan";
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("Idade: " + estudante.idade);
    }
}
