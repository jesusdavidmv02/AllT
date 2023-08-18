package com.tareasUdemy.modulo;

import java.util.Date;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private Date fechayHoraLlegada;
    private int numeroPasajeros;


    public Vuelo(String nombre, String origen, String destino, Date fechayHoraLlegada, int numeroPasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechayHoraLlegada = fechayHoraLlegada;
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechayHoraLlegada() {
        return fechayHoraLlegada;
    }

    public void setFechayHoraLlegada(Date fechayHoraLlegada) {
        this.fechayHoraLlegada = fechayHoraLlegada;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
}
