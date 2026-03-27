package br.com.paulo.mercado.service;

import br.com.paulo.mercado.cliente.Cliente;

import java.util.ArrayList;

public class ClienteService {
    private ArrayList<Cliente> listaCliente = new ArrayList<>();

    public void adicionarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void listarClientes(){

    }



}
