package com.example.springcoredojo.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class CajaAhorro {
    private int numcaja;
    private double ahorro;

    Cliente c = new Cliente();

    public double getAhorro(double ahorro){
        ahorro = c.getApertura() - ((c.getApertura()*0.03) + (c.getApertura()*0.16));
        return ahorro;
    }

    public int getNumcaja() {
        return numcaja;
    }

    public void setNumcaja(int numcaja) {
        this.numcaja = numcaja;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }
}
