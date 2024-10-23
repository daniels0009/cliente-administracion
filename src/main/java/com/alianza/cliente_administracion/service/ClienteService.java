package com.alianza.cliente_administracion.service;

import com.alianza.cliente_administracion.model.Cliente;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final List<Cliente> clientes = new ArrayList<>();

    public ClienteService() {

    }

    public List<Cliente> obtenerClientes() {
        return clientes;
    }

    public Cliente buscarPorSharedKey(String sharedKey) {
        return clientes.stream()
                .filter(cliente -> cliente.getSharedKey().equals(sharedKey))
                .findFirst()
                .orElse(null);
    }

    public Cliente crearCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }
}