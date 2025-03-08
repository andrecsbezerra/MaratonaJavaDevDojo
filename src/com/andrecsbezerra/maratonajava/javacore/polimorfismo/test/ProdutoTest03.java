package com.andrecsbezerra.maratonajava.javacore.polimorfismo.test;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Computador;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Produto;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Tomate;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto =  new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Tomate", 100);
        tomate.setDataValidade("11/12/2021");
        CalculadoraImposto.calcularImposto(tomate);
        CalculadoraImposto.calcularImposto(produto);
    }
}
