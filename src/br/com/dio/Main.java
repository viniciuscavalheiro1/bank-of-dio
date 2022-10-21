package br.com.dio;

import br.com.dio.entidades.Banco;
import br.com.dio.entidades.Cliente;
import br.com.dio.entidades.ContaCorrente;
import br.com.dio.entidades.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        //Orientação a Objetos simples.
        //Poderia fazer um menu, cadastrar as contas, optei fazer mocado assim.
        Banco banco = new Banco("Bradesco");
        Cliente cliente = new Cliente("Vinicius", "123123");
        banco.adicionaCliente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(100);
        cliente.adicionaConta(contaPoupanca);

        Cliente cliente2 = new Cliente("Joao", "1245623");
        banco.adicionaCliente(cliente2);
        ContaCorrente contaCorrente = new ContaCorrente();
        cliente2.adicionaConta(contaCorrente);
        contaCorrente.depositar(100);

        contaCorrente.transferir(10, contaPoupanca);

        System.out.println("Saldo cliente 1: " + cliente.getSaldo());
        System.out.println("Saldo cliente 2: " + cliente2.getSaldo());

        System.out.printf(banco.getClientes().toString());
    }
}