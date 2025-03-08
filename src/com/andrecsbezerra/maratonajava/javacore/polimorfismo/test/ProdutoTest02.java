package com.andrecsbezerra.maratonajava.javacore.polimorfismo.test;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Computador;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Produto;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto =  new Computador("Ryzen 9", 3000);
        Produto produto1 = new Tomate("Tomate", 100);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
    }
}
