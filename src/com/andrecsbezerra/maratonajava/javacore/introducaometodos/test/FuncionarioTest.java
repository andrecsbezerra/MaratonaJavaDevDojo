package com.andrecsbezerra.maratonajava.javacore.introducaometodos.test;

import com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Pedro";
        funcionario1.idade = 25;
        funcionario1.salarios = new double[]{1200, 987.32,2000};
        funcionario1.imprime();
    }
}
