package com.example.clase4.cine;

import java.util.List;

public class ListaPersonas extends Persona{

    public List<Persona> personas;

    public ListaPersonas(int edad, double precio) {
        super(edad, precio);
    }
}
