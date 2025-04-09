package com.andrecsbezerra.maratonajava.javacore.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Funcionario salvo com sucesso");
    }
}
