package com.andrecsbezerra.maratonajava.javacore.introducaometodos.test;

import com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int x = 1;
        int y = 2;
        calculadora.alteraDoisNumeros(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}
