package com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.dominio;

import java.util.ArrayList;
import java.util.List;

public class Seminario {
    private String titulo;

    private List<Aluno> alunos;
    private Local local;

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = new ArrayList<>();
    }

    public boolean adicionarAluno(Aluno aluno){
        if (!aluno.isInscrito()){
            alunos.add(aluno);
            aluno.setSeminario(this);
            return true;

        }else {
            System.out.println("Aluno " + aluno.getNome() + "já está inscrito");
            return false;
        }
    }

    public String getTitulo() {return titulo;}
    public Local getLocal() {return local;}
    public List <Aluno> getAlunos() {return alunos;}
}
