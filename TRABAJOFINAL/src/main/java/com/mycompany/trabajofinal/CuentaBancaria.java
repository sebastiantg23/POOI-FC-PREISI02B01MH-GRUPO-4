/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author sebas
 */
// Clase base CuentaBancaria
public class CuentaBancaria {
    private String numeroCuenta;
    private String tipoCuenta;
    private Direccion direccion;
    private double saldo;//arreglar la relacion entre usuario y cuenta bancaria   1 usuario puede tenre de 0 a *

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    

    // Getters y setters para los atributos
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", tipoCuenta=" + tipoCuenta + ", direccion=" + direccion + ", saldo=" + saldo + '}';
    }

    
}
