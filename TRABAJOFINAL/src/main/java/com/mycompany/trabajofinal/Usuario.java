/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sebas
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private List<CuentaBancaria> cuentasBancarias;
    

    public Usuario(String nombre, String apellido, String telefono, String email, List<CuentaBancaria> cuentasBancarias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.cuentasBancarias = cuentasBancarias;
    }
    
    public void agregarCuentaBancaria(CuentaBancaria cuenta) {
        cuentasBancarias.add(cuenta);
    }

    public void eliminarCuentaBancaria(String numeroCuenta) {
        cuentasBancarias.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}