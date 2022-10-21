package br.com.dio.entidades;

public class Cliente {
    private String nome;
    private String cpf;

    private Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionaConta(Conta conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return conta.getSaldo();
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", conta=" + conta +
                '}';
    }
}
