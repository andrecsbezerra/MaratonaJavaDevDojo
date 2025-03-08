package com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando num banco de dados");
    }
}
