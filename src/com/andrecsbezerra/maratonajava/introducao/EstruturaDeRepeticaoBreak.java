package com.andrecsbezerra.maratonajava.introducao;

public class EstruturaDeRepeticaoBreak {
    public static void main(String[] args) {
        // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50.
        for (int i = 0; i <= 50; ++i){
            System.out.println(i);
            if (i == 25){
                break;
            }
        }
    }
}
