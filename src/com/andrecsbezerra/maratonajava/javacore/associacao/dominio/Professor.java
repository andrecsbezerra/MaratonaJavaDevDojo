package com.andrecsbezerra.maratonajava.javacore.associacao.dominio;

public class Professor {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor(String nome) {
        this.nome = nome;
    }
}
