package com.alianza.cliente_administracion.controller;

import com.alianza.cliente_administracion.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>();

    // Constructor para inicializar algunos datos
    public ClienteController() {
        clientes.add(new Cliente("guti123", "Juliana Gutierrez", "jgutierez@gmail.com", "3219876543", "20/05/2019"));
        clientes.add(new Cliente("mart456", "Manuel Martinez", "mmartinez@gmail.com", "3219876543", "20/05/2019"));
        clientes.add(new Cliente("ana789", "Ana Ruiz", "aruiz@gmail.com", "3219876543", "21/06/2020"));
    }

    // Obtener lista de clientes
    @GetMapping
    public List<Cliente> listarClientes() {
        return clientes;
    }

    // Buscar cliente por Shared Key
    @GetMapping("/{sharedKey}")
    public Cliente buscarCliente(@PathVariable String sharedKey) {
        return clientes.stream()
                .filter(cliente -> cliente.getSharedKey().equals(sharedKey))
                .findFirst()
                .orElse(null);
    }

    // Crear nuevo cliente
    @PostMapping
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    // Búsqueda avanzada de clientes
    @GetMapping("/buscar")
    public List<Cliente> buscarClientes(
        @RequestParam(required = false) String sharedKey,
        @RequestParam(required = false) String nombre,
        @RequestParam(required = false) String telefono,
        @RequestParam(required = false) String email,
        @RequestParam(required = false) String fecha) {

        return clientes.stream()
                .filter(cliente -> (sharedKey == null || cliente.getSharedKey().contains(sharedKey)) &&
                                   (nombre == null || cliente.getNombre().toLowerCase().contains(nombre.toLowerCase())) &&
                                   (telefono == null || cliente.getTelefono().contains(telefono)) &&
                                   (email == null || cliente.getEmail().toLowerCase().contains(email.toLowerCase())) &&
                                   (fecha == null || cliente.getFecha().equals(fecha)))
                .collect(Collectors.toList());
    }
}
