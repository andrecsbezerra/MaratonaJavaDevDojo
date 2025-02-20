package com.andrecsbezerra.maratonajava.javacore.sobrecargametodos.test;

import com.andrecsbezerra.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Kamisama Hajimemashita","Romance",24);
        anime.init("Kamisama Hajimemashita","Romance",24, "TV");
        anime.imprime();
    }
}
