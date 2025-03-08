package com.andrecsbezerra.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo a checagem de permissões");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
