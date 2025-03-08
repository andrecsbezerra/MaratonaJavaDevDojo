package com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando um arquivo");
    }
}
