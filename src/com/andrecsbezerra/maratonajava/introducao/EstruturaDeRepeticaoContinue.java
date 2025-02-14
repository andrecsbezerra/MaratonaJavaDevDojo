package com.andrecsbezerra.maratonajava.introducao;

public class EstruturaDeRepeticaoContinue {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: Valor da parcela >= 1000
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1 ;parcela--){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.printf("Parcela %d: R$ %.2f%n",parcela, valorParcela);
        }
    }
}
