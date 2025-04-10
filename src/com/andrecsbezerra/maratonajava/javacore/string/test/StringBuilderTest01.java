package com.andrecsbezerra.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Willian Suane";
        nome.concat(" Devdojo");
        nome.substring(0, 3); // retorna uma string
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Willian Suane");
        sb.append(" Devdojo").append(" Academy"); // retorna um StringBuilder
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
