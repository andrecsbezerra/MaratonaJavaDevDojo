package com.andrecsbezerra.maratonajava.javacore.associacaoexercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public boolean isInscrito(){
        return seminario != null;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if(seminario != null){
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
        }else {
            System.out.println("Não está inscrito em nunhum seminário");
        }
    }

    public Seminario getSeminario() {return seminario;}
    public void setSeminario(Seminario seminario) {this.seminario = seminario;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}
