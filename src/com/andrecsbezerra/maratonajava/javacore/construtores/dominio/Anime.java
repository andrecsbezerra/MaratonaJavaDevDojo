package com.andrecsbezerra.maratonajava.javacore.construtores.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;
    private String estudio;

    public Anime(String nome, String genero,int episodios,String tipo) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.tipo = tipo;
    }
    public Anime(String nome, String genero,int episodios,String tipo,String estudio) {
        this(nome,genero,episodios,estudio);
        this.estudio = estudio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
        System.out.println(this.estudio);
    }
}
