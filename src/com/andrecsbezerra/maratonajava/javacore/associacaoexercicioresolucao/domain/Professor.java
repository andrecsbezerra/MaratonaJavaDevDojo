package com.andrecsbezerra.maratonajava.javacore.associacaoexercicioresolucao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("--------");
        System.out.println("Professor: " + this.nome);
        System.out.println("## Seminarios Cadastrados ##");
        if(this.seminarios == null) return;
        for (Seminario seminario: this.seminarios){
            System.out.println("Título: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** ALunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Nome: " +aluno.getNome());
                System.out.println("Idade: "+ aluno.getIdade());
                System.out.println("Seminario: "+ aluno.getSeminario().getTitulo());
            }

        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminarios;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminarios = seminario;
    }
}
