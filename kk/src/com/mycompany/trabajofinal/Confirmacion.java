/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;
import java.time.LocalDateTime;

/**
 *
 * @author Nayeli
 */
public class Confirmacion {
    private CuentaBancaria cuenta;
    private Usuario usuario;
    private LocalDateTime fechaHoraCreacion;

    public Confirmacion(CuentaBancaria cuenta, Usuario usuario) {
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.fechaHoraCreacion = LocalDateTime.now(); // Establecer la fecha y hora de creación al momento de la instancia.
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    } 

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Confirmación de cuenta creada:\n" +
                "Cuenta: " + cuenta.getNumeroCuenta() + "\n" +
                "Usuario: " + usuario.getNombre() + " " + usuario.getApellido() + "\n" +
                "Fecha y hora de creación: " + fechaHoraCreacion;
    }  
} 
