package com.andrecsbezerra.maratonajava.introducao;

public class ArraysMultidimencionais {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31,28 ,31 ,30
        int[][]dias=new int[3][3];
        dias [0][0] = 1;
        dias [0][1] = 1;
        dias [0][2] = 1;

        dias [1][0] = 1;
        dias [1][1] = 1;
        dias [1][2] = 1;

        for (int i = 0 ; i < dias.length; i++){
            for (int j = 0 ; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

    }
}
