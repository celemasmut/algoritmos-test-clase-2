package com.redbeeacademy.algoritmostest.Lista.EjercicioCine;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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



public class Cine {

    public static double cantidadTotalRecaudada(List<Persona> personas){
        double cantidadTotal = 0;
        //TODO -> implement me
        for(Persona miPersona : personas){
            if(miPersona != null) {
                if (miPersona.getEdad() >= 5 && miPersona.getEdad() <= 10) {
                    cantidadTotal += 100;
                }
                if (miPersona.getEdad() >= 11 && miPersona.getEdad() <= 17) {
                    cantidadTotal += 150;
                }
                if (miPersona.getEdad() >= 18 && miPersona.getEdad() <= 60) {
                    cantidadTotal += 200;
                }
            }
        }
        return cantidadTotal;
    }

    public static Integer cantidadPersonas(List<Persona> personas){
        Integer cantidadPersonas = 0;

        for(Persona miPersona : personas){
            if(miPersona != null){
                cantidadPersonas++;
            }
        }

        return cantidadPersonas;
    }

    public static double promedioEdad(List<Persona> personas){
        double promedio = 0;
        double sumaEdades =0;
        List<Persona> nuevalistaPersona = new ArrayList<>(personas);
        nuevalistaPersona = nuevalistaPersona.stream()
                .collect(Collectors.toList());
        int contador = 0;
        while (contador < nuevalistaPersona.size()) {
            if (nuevalistaPersona.get(contador) == null) {
                nuevalistaPersona.remove(contador);
            }
            contador++;
        }
        for (Persona miPersona : nuevalistaPersona){
                sumaEdades +=miPersona.getEdad();
        }
        promedio = sumaEdades / nuevalistaPersona.size();
        //TODO -> implement me
        //quiero limitar los decimales del promedio
        promedio = Math.round(promedio * 100) / 100d;

        return promedio;
    }
}
