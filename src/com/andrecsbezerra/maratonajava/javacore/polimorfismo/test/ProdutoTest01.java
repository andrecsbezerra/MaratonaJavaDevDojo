package com.andrecsbezerra.maratonajava.javacore.polimorfismo.test;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Computador;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Televisao;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Tomate;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 10000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println();
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println();
        CalculadoraImposto.calcularImposto(televisao);
    }
}
