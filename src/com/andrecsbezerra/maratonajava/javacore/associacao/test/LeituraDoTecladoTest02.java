package com.andrecsbezerra.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite sua pergunta que direi sim ou não");
        String pergunta = sc.nextLine();
        if (pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NÃO");
        }
    }
}
