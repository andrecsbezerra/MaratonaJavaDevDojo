package com.andrecsbezerra.maratonajava.javacore.introducaoclasses.test;

import com.andrecsbezerra.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Camaro";
        carro.modelo = "Sport";
        carro.ano = 2013;

        carro2.nome = "Ferrari";
        carro2.modelo = "Sport";
        carro2.ano = 2011;

        System.out.println("Carro 1");
        System.out.println(carro.nome);
        System.out.println(carro.modelo );
        System.out.println(carro.ano);
        System.out.println("\nCarro 2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo );
        System.out.println(carro2.ano);




    }
}
