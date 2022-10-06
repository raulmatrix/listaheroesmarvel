package com.example.heroesmarvel;

import java.io.Serializable;

public class Heroe implements Serializable {
    String nombre;
    String poder;
    int cantEstrellas;


    public Heroe(String nombre, String poder, int cantEstrellas) {
        this.nombre = nombre;
        this.poder = poder;
        this.cantEstrellas = cantEstrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(int cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }
}
