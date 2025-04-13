package com.andrecsbezerra.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo o que não for digito
        // \s = Todos os Espaços em branco (\t \n \f \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W= Tudo que não for incluso no \w

        String regex = "\\W";
        String texto = "abaaba";
        String texto2 = "h¨h j212 @gv h2_1%kh2!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() +" " +matcher.group());
        }
    }
}
