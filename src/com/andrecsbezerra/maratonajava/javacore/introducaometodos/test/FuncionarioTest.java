package com.andrecsbezerra.maratonajava.javacore.introducaometodos.test;

import com.andrecsbezerra.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Pedro");
        funcionario1.setIdade(25);
        funcionario1.setSalarios(new double[]{2500,2000,1000});
        funcionario1.imprime();
    }
}
