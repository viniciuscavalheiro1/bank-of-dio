package br.com.dio.entidades;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;
    protected int agencia;
    protected int conta;
    protected double saldo;



    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }


    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
}
