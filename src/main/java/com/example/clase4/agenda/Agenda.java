package com.example.clase4.agenda;

import com.example.clase4.exceptions.ContactNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


/*
Empelando la clase HashMap<String,Integer>() de la biblioteca de java (una
implementación de tablas hash con un string (nombre) de clave y un entero (telefono) de valor)

1) crear un nuevo contacto
2) modificar un telefono, si el telefono no existe devolver excepcion
3) obtener un telefono, si el telefono no existe devolver excepcion
4) eliminar un telefono, si el telefono no existe devolver excepcion
5) devolver telefonos

 */
public class Agenda {


    private static HashMap<String, Integer> miAgenda =
            new HashMap<>();

    public static void nuevoContacto(String nombre, int telefono) {
        miAgenda.put(nombre, telefono);
    }

    public static void modificarTelefono(String nombre, int telefono) {
        if (Objects.isNull(miAgenda.get(nombre))) {
            throw new ContactNotFoundException("Contacto no existente");
        }
        miAgenda.put(nombre, telefono);
    }

    public static Integer obtenerTelefono(String nombre) {
        Integer telefono = miAgenda.get(nombre);
        if (Objects.isNull(telefono)) {
            throw new ContactNotFoundException("Contacto no existente");
        }
        return telefono;
    }

    public static boolean eliminarTelefono(String nombre) {
        Integer telefono = miAgenda.remove(nombre);
        if (Objects.isNull(telefono)) {
            throw new ContactNotFoundException("Contacto no existente");
        }
        return true;
    }

    protected static List<Integer> miAgenda() {
        return miAgenda.values().stream().collect(Collectors.toList());
    }


}
