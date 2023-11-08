package com.mycompany.trabajofinal;


import com.mycompany.trabajofinal.CuentaBancaria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class CuentaIndependienteCP extends CuentaBancaria {
    private double comisionMensual;

    // Constructor

    public CuentaIndependienteCP(double comisionMensual, String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo) {
        super(numeroCuenta, tipoCuenta, direccion, saldo);
        this.comisionMensual = comisionMensual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

   
 
}

