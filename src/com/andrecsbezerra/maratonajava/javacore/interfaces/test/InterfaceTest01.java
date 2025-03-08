package com.andrecsbezerra.maratonajava.javacore.interfaces.test;

import com.andrecsbezerra.maratonajava.javacore.interfaces.dominio.DataLoader;
import com.andrecsbezerra.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import com.andrecsbezerra.maratonajava.javacore.interfaces.dominio.FileLoader;

public class InterfaceTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        System.out.println();

        databaseLoader.remove();
        fileLoader.remove();

        System.out.println();

        fileLoader.checkPermission();
        databaseLoader.checkPermission();

        System.out.println();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();


    }
}
