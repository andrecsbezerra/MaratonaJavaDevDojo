package com.andrecsbezerra.maratonajava.introducao;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 50;
        String mensagemDoar = "Doar 500";
        String mensagemNaoDoar = "Não Doar";
        String resultado = (salario >= 500) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        String resultado2 = (salario >= 500) ? "Doar 500" : "Não Doar";
        System.out.println(resultado2);
    }
}
