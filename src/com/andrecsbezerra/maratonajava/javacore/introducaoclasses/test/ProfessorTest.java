package com.andrecsbezerra.maratonajava.javacore.introducaoclasses.test;

import com.andrecsbezerra.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "joao";
        professor.idade = 65;
        professor.sexo = 'M';

        System.out.println(professor.idade +" "+ professor.nome + " "+ professor.sexo);
    }

}
