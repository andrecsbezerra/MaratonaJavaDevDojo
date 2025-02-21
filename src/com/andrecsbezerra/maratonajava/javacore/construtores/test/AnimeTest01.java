package com.andrecsbezerra.maratonajava.javacore.construtores.test;

import com.andrecsbezerra.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Kamisama Hajimemashita","Romance",24, "TV", "TMS Entertainment");
        anime.imprime();
    }
}
