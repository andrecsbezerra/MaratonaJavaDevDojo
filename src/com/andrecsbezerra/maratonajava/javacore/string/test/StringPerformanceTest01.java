package com.andrecsbezerra.maratonajava.javacore.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long incio = System.currentTimeMillis();
        concatString(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (fim - incio) + "ms");


        incio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (fim - incio) + "ms");

        incio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para string " + (fim - incio) + "ms");
    }

    static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0 \ 01 \ 012 \ 0123
        }
    }

    static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
