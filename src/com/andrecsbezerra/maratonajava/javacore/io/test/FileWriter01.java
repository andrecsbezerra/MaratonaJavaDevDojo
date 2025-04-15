package com.andrecsbezerra.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWritter
// BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Skibidi Toilet Rizz \nContinuando a próxima linha");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
