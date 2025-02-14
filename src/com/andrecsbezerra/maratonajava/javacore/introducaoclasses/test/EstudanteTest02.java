package com.andrecsbezerra.maratonajava.javacore.introducaoclasses.test;

import com.andrecsbezerra.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "zoro";
        Estudante estudante2 = new Estudante();
        estudante2.nome = "sanji";

        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);

        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.nome);
    }
}
