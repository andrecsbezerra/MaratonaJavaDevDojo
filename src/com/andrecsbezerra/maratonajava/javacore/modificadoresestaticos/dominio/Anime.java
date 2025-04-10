package com.andrecsbezerra.maratonajava.javacore.modificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - Bloco de Inicialização é executado quando a JVM carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passada
    // 3 - bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
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
        for (int ep : Anime.episodios){
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
