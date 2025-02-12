package com.andrecsbezerra.maratonajava.introducao;

public class Switch {
    public static void main(String[] args) {
        String sexo = "F";
        switch (sexo){
            case "M":
                System.out.println("homem");
                break;
            case "F":
                System.out.println("mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
