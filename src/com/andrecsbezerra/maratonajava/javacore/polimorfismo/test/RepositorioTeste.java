package com.andrecsbezerra.maratonajava.javacore.polimorfismo.test;

import com.andrecsbezerra.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;
import com.andrecsbezerra.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
