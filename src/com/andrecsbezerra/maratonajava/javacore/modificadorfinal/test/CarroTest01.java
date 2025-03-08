package com.andrecsbezerra.maratonajava.javacore.modificadorfinal.test;

import com.andrecsbezerra.maratonajava.javacore.modificadorfinal.dominio.Carro;
import com.andrecsbezerra.maratonajava.javacore.modificadorfinal.dominio.Comprador;
import com.andrecsbezerra.maratonajava.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        carro.setNome("McQueen");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("PEDRO");

        System.out.println(carro.COMPRADOR);

        // Dar uma olhada Em Singleton Pattern

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}