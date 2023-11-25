/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author sebas
 */
public class CuentaDeAhorro extends CuentaBancaria {
    private double tasaInteres;

    // Constructor

    public CuentaDeAhorro(double tasaInteres, String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo) {
        super(numeroCuenta, tipoCuenta, direccion, saldo);
        this.tasaInteres = tasaInteres;
    }


    
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
}

