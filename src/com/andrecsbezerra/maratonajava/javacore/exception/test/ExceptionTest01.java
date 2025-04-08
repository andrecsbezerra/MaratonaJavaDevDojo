package com.andrecsbezerra.maratonajava.javacore.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        boolean criarArquivo = false;
        boolean deletarArquibo = true;
        if (criarArquivo) {
            criarNovoArquivo();
        }
        if (deletarArquibo){
            deletarNovoArquivo();
        }
    }

    private  static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deletarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        file.delete();
    }
}
