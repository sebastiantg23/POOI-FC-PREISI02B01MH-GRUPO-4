/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author USER
 */
public class Direccion {
    private String calle;
    private String numero;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    // Constructor
    public Direccion(String calle, String numero, String ciudad, String estado, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    // Métodos de acceso (getters y setters)
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    // Otros métodos, como toString, si es necesario
    @Override
    public String toString() {
        return "Dirección: " + numero + " " + calle + ", " + ciudad + ", " + estado + " " + codigoPostal;
    }

    // Otros métodos y funcionalidades según tus necesidades
}