/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajofinal;

/**
 *
 * @author sebas
 */
public class CuentaGanadora extends CuentaBancaria {

    private String ParticipacionSorteo;
    
    public CuentaGanadora(String numeroCuenta, String tipoCuenta, Direccion direccion, double saldo, Usuario titular) {
        super(numeroCuenta, tipoCuenta, direccion, saldo, titular);
    }
    
    public void setParticipacionSorteo(String ParticipacionSorteo) {
        this.ParticipacionSorteo = ParticipacionSorteo;
    }
    

    public String getParticipacionSorteo() {
        return "Usted ya esta participando del sorteo. ¡Muchas gracias por abrir su Cuenta Ganadora!";
    }
}

