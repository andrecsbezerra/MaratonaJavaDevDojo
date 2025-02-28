package com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.test;

import com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.dominio.Aluno;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.dominio.Local;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.dominio.Professor;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.dominio.Seminario;

public class SeminarioSystem {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Aluno1",18);
        Aluno aluno2 = new Aluno("Aluno2",24);
        Aluno [] alunos = {aluno1,aluno2};

        Local local = new Local("São paulo");
        Seminario seminario1 = new Seminario("As obras da Criação",local);

        Local local2 = new Local("Rio de Janeiro");
        Seminario seminario2 = new Seminario("Os milagres da Física",local2);

        Seminario [] seminarios = {seminario1, seminario2};



        System.out.println("-------");
        seminario1.adicionarAluno(aluno1);
        aluno1.imprime();

        System.out.println("-------");

        seminario1.adicionarAluno(aluno2);
        aluno2.imprime();

        System.out.println("-------");

        Professor professor = new Professor("Pedro","Física");
        professor.setSeminarios(seminarios);
        professor.imprime();
    }
}