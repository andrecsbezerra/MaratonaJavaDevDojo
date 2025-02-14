package com.andrecsbezerra.maratonajava.introducao;

public class ArraysForEach {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbers2 = {1,2,3,4,9};

        for(int num: numbers){
            System.out.println(num);
        }
        for(int num: numbers2){
            System.out.println(num);
        }

    }
}
