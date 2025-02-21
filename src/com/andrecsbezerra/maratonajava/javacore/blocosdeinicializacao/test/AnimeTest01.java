package com.andrecsbezerra.maratonajava.javacore.blocosdeinicializacao.test;

import com.andrecsbezerra.maratonajava.javacore.blocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio+ " ");
            
        }

    }
}
