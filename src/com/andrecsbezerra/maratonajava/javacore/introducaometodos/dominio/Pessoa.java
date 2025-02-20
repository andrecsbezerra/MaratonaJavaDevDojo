package com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
         if(idade >= 0){
             System.out.println(getIdade());
         }
         else{
             System.out.println("Idade Inválida");
         }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
