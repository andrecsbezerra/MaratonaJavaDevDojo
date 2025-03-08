package com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.test;

import com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.domain.Aluno;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.domain.Local;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.domain.Professor;
import com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.domain.Seminario;

public class main {
    public static void main(String[] args) {
        Local local = new Local("Grand Blue");
        Aluno aluno = new Aluno("Pedro", 20);
        Professor professor = new Professor("White bear", "Sword");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("How to travel in Grand Blue",local, alunosParaSeminario);

        Seminario[] seminariosDisponiveis = {seminario};

        aluno.setSeminario(seminario);

        professor.setSeminario(seminariosDisponiveis);

        professor.imprime();

    }
}
