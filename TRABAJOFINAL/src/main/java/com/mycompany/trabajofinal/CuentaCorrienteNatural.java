/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author sebas
 */
public class CuentaCorrienteNatural extends CuentaBancaria {
    private double lineaCredito;

    // Constructor

    public CuentaCorrienteNatural(double lineaCredito, String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo) {
        super(numeroCuenta, tipoCuenta, direccion, saldo);
        this.lineaCredito = lineaCredito;
    }
    

    public double getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(double lineaCredito) {
        this.lineaCredito = lineaCredito;
    }
    
}
