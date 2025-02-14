package com.andrecsbezerra.maratonajava.javacore.introducaometodos.test;

import com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double divisao = calculadora.divideDoisNumeros(10,0);
        calculadora.imprimeDivisaoDoisNumeros02(10,2);
        System.out.println(divisao);
    }
}
