package com.andrecsbezerra.maratonajava.javacore.introducaoclasses.test;

import com.andrecsbezerra.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 18;
        estudante.nome = "Pedro";
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

    }
}
