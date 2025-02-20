package com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

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
        for (double salario: salarios){
            media+= salario;
        }
        System.out.printf("%nMedia salarial: R$ %.2f",media /= salarios.length);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}