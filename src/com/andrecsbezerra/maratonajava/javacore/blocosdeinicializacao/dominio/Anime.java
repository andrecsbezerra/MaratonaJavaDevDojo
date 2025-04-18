package com.andrecsbezerra.maratonajava.javacore.blocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 - bloco de inicialização é executado
    // 4 - Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < 100; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for (int ep : this.episodios){
            System.out.print(ep + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
