package com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(20-1);
    }
    public void multiplicaDoisNumeros(int x,int y){
        System.out.println(x * y);
    }
    public double divideDoisNumeros(double x, double y){
        if (y == 0){
            return 0;
        }
        return x / y;
    }
    public double divideDoisNumeros02(double x, double y){
        if (x == 0){
            return 0;
        }else {
            return x / y;
        }
    }

    public void imprimeDivisaoDoisNumeros02( double x, double y){
        if (x ==0){
            System.out.println("Não existe divisao por 0");
        }else {
            System.out.println(x/y);
        }
    }

    public void alteraDoisNumeros(int x , int y){
        x = 99;
        y = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
}
