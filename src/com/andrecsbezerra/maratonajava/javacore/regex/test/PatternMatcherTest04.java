package com.andrecsbezerra.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for digito
        // \s = Todos os Espaços em branco (\t \n \f \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W= Tudo que não for incluso no \w
        // []
        // ? Zero ou uma
        // * Zero ou mais
        // {n,m] de n até m
        // ()
        // | o(v|c)o ovo | coco
        // $ Fim da linha

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() +" " +matcher.group());
        }

        int numeroHex = 0xDFA;
        System.out.println(numeroHex);
    }
}
