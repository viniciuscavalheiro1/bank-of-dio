package br.com.dio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Cliente> clientes = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    public void adicionaCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
}
