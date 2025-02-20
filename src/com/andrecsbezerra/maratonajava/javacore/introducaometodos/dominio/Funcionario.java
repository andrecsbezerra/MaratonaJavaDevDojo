package com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null){
            return;
        }
        for (double salario: salarios){
            System.out.printf("R$ %.2f ", salario);
        }
        imprimeMediaSalarial();
    }

    private void imprimeMediaSalarial(){
        double media = 0;
        for (double salario: salarios){
            media+= salario;
        }
        System.out.printf("%nMedia salarial: R$ %.2f",media /= salarios.length);
    }
}