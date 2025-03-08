package com.andrecsbezerra.maratonajava.javacore.enumeracoes.test;

import com.andrecsbezerra.maratonajava.javacore.enumeracoes.dominio.Cliente;
import com.andrecsbezerra.maratonajava.javacore.enumeracoes.dominio.TipoCliente;
import com.andrecsbezerra.maratonajava.javacore.enumeracoes.dominio.TipoPagamento;

public class EnumTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2= new Cliente("Akira", TipoCliente.PESSOA_JURIDICA,TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Saiki", TipoCliente.PESSOA_FISICA, TipoPagamento.PIX);



        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
