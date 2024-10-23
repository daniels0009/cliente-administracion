package com.alianza.cliente_administracion.model;

public class Cliente {
    private String sharedKey;
    private String nombre;
    private String email;
    private String telefono;
    private String fecha; // Data Added

    // Constructor vacío
    public Cliente() {
    }

    // Constructor con parámetros
    public Cliente(String sharedKey, String nombre, String email, String telefono, String fecha) {
        this.sharedKey = sharedKey;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.fecha = fecha;
    }

    // Getters y Setters
    public String getSharedKey() {
        return sharedKey;
    }

    public void setSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
