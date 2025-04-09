package com.andrecsbezerra.maratonajava.javacore.exception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw  new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
