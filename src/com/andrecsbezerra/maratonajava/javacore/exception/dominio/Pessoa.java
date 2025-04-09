package com.andrecsbezerra.maratonajava.javacore.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Savando Pessoa...");
    }
}
