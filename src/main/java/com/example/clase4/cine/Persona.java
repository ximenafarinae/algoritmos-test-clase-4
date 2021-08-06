package com.example.clase4.cine;


public class Persona {

    protected Integer edad;
    protected Double precio;


    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Persona(int edad, double precio) {
        this.edad = edad;
        this.precio = precio;
    }
}

