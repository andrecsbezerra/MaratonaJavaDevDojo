package com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Produto;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.domain.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser Pago: " + imposto);

//        if (produto instanceof Tomate){
//            Tomate tomate = (Tomate) produto;
//            System.out.println(tomate.getDataValidade());
//        }

        if (produto instanceof Tomate){
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);
        }
    }
}
