package com.andrecsbezerra.maratonajava.javacore.introducaometodos.test;

import com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(-5);

        pessoa.imprime();

    }
}
