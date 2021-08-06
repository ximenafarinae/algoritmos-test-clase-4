package com.example.clase4.cine;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CineTest {

    @Test
    @DisplayName("Tests happy path total recaudado")
    public void testHappyPathTotalRecaudado() {
        Double result = Cine.cantidadTotalRecaudada(List.of(new Persona(30, 200), new Persona(17, 150), new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(650, result);
    }

    @Test
    @DisplayName("Test when null values are sent total recaudado")
    public void testNullValuesTotalRecaudado() {
        Double result = Cine.cantidadTotalRecaudada(Arrays.asList(new Persona(30, 200), null, new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(500, result);
    }

    @Test
    @DisplayName("Tests happy path cantidad personas")
    public void testHappyPathCantidadPersonas() {
        Long result = Cine.cantidadPersonas(List.of(new Persona(30, 200), new Persona(17, 150), new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Test when null values are sent cantidad personas")
    public void testNullValuesCantidadPersonas() {
        Long result = Cine.cantidadPersonas(Arrays.asList(new Persona(30, 200), null, new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Tests happy path")
    public void testHappyPathPromedioEdad() {
        Double result = Cine.promedioEdad(List.of(new Persona(30, 200), new Persona(17, 150), new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(18.25, result);
    }

    @Test
    @DisplayName("Test when null values are sent promedio edad")
    public void testNullValuesPromedioEdad() {
        Double result = Cine.promedioEdad(Arrays.asList(new Persona(30, 200), null, new Persona(8, 100), new Persona(18, 200)));
        assertNotNull(result, "The result cannot be null");
        assertEquals(18.666666666666668, result);
    }

}
