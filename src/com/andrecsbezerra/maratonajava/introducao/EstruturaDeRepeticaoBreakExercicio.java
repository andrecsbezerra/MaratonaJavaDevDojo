package com.andrecsbezerra.maratonajava.introducao;

public class EstruturaDeRepeticaoBreakExercicio {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: Valor da parcela >= 1000
        double valorCarro = 52000.52;
        for (int parcela = 1; parcela <= 12 ;parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela <= 1000){
                break;
            }
            System.out.printf("Parcela %d: R$ %.2f%n",parcela, valorParcela);
        }
    }
}
