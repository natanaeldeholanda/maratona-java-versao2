package javacore.Fmodificadorestatico.test;

import javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(300);
        Carro carro1 = new Carro("Audi", 320);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("BMW", 300);
        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
