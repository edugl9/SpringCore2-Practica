package com.example.springcoredojo.banco;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("clientes-config.properties")
public class Cliente {
    @Value("${cliente.nombre}")
    private String nombre;
    @Value("${cliente.apellido}")
    private String apellido;
    @Value("${cliente.tipocuenta}")
    private String tipocuenta;
    @Value("${cliente.apertura}")
    private double apertura;

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", tipocuenta='" + tipocuenta + '\'' +
                ", apertura=" + apertura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }
}
