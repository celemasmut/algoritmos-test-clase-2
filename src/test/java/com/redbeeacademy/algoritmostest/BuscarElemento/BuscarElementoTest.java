package com.redbeeacademy.algoritmostest.BuscarElemento;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BuscarElementoTest {

    @Test
    void devuelvoFalse() {
        boolean resultado = BuscarElemento.devuelvoVerdadero(List.of(3,6,4,2,7,4,1), 8);

        assertFalse(resultado); //deberia dar false
    }

    @Test
    void devuelvoVerdadero() {
        boolean resultado = BuscarElemento.devuelvoVerdadero(List.of(3,6,4,2,7,4,1), 2);

        assertTrue(resultado); //deberia dar false
    }
}