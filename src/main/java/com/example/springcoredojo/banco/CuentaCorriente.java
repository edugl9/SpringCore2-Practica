package com.example.springcoredojo.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class CuentaCorriente {
    private int numcuenta;
    private double saldo;

    Cliente c = new Cliente();

    public double getSaldo(){
        saldo = c.getApertura() - ((c.getApertura()*0.02) + (c.getApertura()*0.16));
        return saldo;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    /*public double getSaldo() {
        return saldo;
    }*/

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
