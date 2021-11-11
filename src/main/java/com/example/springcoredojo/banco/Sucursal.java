package com.example.springcoredojo.banco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sucursal {

    //@Autowired
    private Banco nomsucursal;

    public Banco getNomsucursal(){
        return nomsucursal;
    }

}
