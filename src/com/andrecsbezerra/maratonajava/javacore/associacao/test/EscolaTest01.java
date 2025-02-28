package com.andrecsbezerra.maratonajava.javacore.associacao.test;

import com.andrecsbezerra.maratonajava.javacore.associacao.dominio.Escola;
import com.andrecsbezerra.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Ju");
        Professor [] professores = {professor};
        Escola escola = new Escola("konoha", professores);

        escola.imprime();
    }
}
