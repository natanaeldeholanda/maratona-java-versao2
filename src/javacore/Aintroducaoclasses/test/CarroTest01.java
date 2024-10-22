package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;
/*
Crie uma classe carro com os seguintes atributos:
Nome
Modelo
Ano
Em seguida, crie dois objetos distintos e imprima seus valores.
 */

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();
        carro01.nome = "BMW";
        carro01.modelo = "X5";
        carro01.ano = 2020;
        carro02.nome = "Mercedes";
        carro02.modelo = "C200";
        carro02.ano = 2021;
        System.out.println(carro01.toString());
        System.out.println(carro02.toString());
    }
}
