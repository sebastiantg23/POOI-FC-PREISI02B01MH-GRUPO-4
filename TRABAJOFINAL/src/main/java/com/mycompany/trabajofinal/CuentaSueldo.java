/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author sebas
 */
public class CuentaSueldo extends CuentaBancaria {
    private double salarioMensual;

    // Constructor

    public CuentaSueldo(double salarioMensual, String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo, Usuario titular) {
        super(numeroCuenta, tipoCuenta, direccion, saldo, titular);
        this.salarioMensual = salarioMensual;
    }


    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
}