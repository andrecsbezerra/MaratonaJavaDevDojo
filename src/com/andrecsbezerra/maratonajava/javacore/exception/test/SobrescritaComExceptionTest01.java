package com.andrecsbezerra.maratonajava.javacore.exception.test;

import com.andrecsbezerra.maratonajava.javacore.exception.dominio.Funcionario;
import com.andrecsbezerra.maratonajava.javacore.exception.dominio.LoginInvalidoException;
import com.andrecsbezerra.maratonajava.javacore.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
