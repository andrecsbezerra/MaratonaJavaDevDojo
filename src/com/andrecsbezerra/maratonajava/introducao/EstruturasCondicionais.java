package com.andrecsbezerra.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida");
        } else {
            System.out.println("Não Autorizado Comprar bebida");
        }
    }
}
