package com.andrecsbezerra.maratonajava.javacore.classesabstratas.test;

import com.andrecsbezerra.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import com.andrecsbezerra.maratonajava.javacore.classesabstratas.dominio.Funcionario;
import com.andrecsbezerra.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami",5000);
        System.out.println(gerente);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Chopper",15000);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
