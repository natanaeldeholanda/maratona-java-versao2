package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner input = new Scanner(System.in);
        String nome = input.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Seu nome é: " + nome + " e sua idade é: " + idade);
        input.close();
    }
}
