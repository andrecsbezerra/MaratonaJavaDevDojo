package com.andrecsbezerra.maratonajava.javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String genero;
    private int episodios;
    private String tipo;

    public Anime() {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public void init(String nome, String genero, int episodios){
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
    }
    public void init(String nome, String genero,int episodios,String tipo){
        this.init(nome,genero,episodios);
        this.tipo = tipo;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.genero);
        System.out.println(this.episodios);
        System.out.println(this.tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
