package com.andrecsbezerra.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua Idade");
        int idade = sc.nextInt();

        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("_-------------_");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);



    }
}
