package com.andrecsbezerra.maratonajava.introducao;

public class Arrays2 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        //char '\u0000' = ' '
        //boolean = false
        //String = null


        String[] herois = new String[4];
        herois[0] = "Goku1";
        herois[1] = "Goku2";
        herois[2] = "Goku3";
        herois[3] = "Goku4";

        for (int i = 0; i< herois.length; i++){
            System.out.println(herois[i]);
        }
    }
}
