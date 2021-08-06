package com.example.clase4.cine;

/*
Un cine de un pueblo nos pide que generemos una aplicacion para controlar las personas de una cola.
La edad de las personas de la cola se generan aleatoriamente entre 5 y 60 años (edad minima 5 - maxímo 60).
La capacidad de la sala es de 50 personas.
Deberemos mostrar:

1) la cantidad total recaudada
2) cuantas personas entraron por cada rango de edad
3) promedio de edad por cada estreno

Precios por edad
entre 5 y 10 años ->  $100
entre 11 y 17 años -> $150
de 18 en adelante -> $200

Tenemos la clase Persona, donde vamos a usarla para modelar edad, y las propiedades que crean convenientes
 */

import com.example.clase4.exceptions.ProductNotFoundException;
import com.example.clase4.shopping.ErrorMessage;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Cine {

    public static double cantidadTotalRecaudada(List<Persona> personas) {

        //Optional.ofNullable(personas).orElseThrow(() -> new ProductNotFoundException("No existe list"));
        return personas
                .stream()
                .filter(obj -> Objects.nonNull(obj))
                .mapToDouble(persona -> Optional.ofNullable(persona.getPrecio()).orElse(0.00))
                .reduce(0, (a, b) -> Double.sum(a, b));

    }

    public static Long cantidadPersonas(List<Persona> personas) {

        return personas
                .stream()
                .filter(Objects::nonNull)
                .count();

    }

    public static double promedioEdad(List<Persona> personas) {

        return personas
                .stream()
                .filter(obj -> Objects.nonNull(obj))
                .mapToInt(persona -> persona.getEdad())
                .summaryStatistics()
                .getAverage();
    }
}
