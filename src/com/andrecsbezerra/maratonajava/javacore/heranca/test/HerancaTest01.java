package com.andrecsbezerra.maratonajava.javacore.heranca.test;

import com.andrecsbezerra.maratonajava.javacore.heranca.domain.Endereco;
import com.andrecsbezerra.maratonajava.javacore.heranca.domain.Funcionario;
import com.andrecsbezerra.maratonajava.javacore.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setCep("111111-1");
        endereco.setRua("Rua dos Cornos");
        Pessoa pessoa = new Pessoa("pessoa.getNome()");
        pessoa.setCpf("123466789-44");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("-------");
        Funcionario funcionario = new Funcionario("Muzan Kibutsuji");
        funcionario.setCpf("14545454545");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
