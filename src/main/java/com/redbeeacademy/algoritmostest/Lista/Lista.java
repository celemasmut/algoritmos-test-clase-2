package com.redbeeacademy.algoritmostest.Lista;
/*
Realizar los siguientes métodos:
1) Guarde un numero en una lista
2) Intercambie el elemento de la posicion 2 por la posicion 4.
3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista
4) Calcular el promedio de los elementos de una lista
5) Eliminar la posicion donde se encuentre el valor maximo de la lista
6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;


public class Lista {

    public static List<Integer> guardarEnLista(Integer numero) {
        //TODO -> implement me
        List<Integer> miLista = new ArrayList<>();
        if (numero != null)
            miLista.add(numero);
        miLista.add(0);
        return miLista;
    }

    public static List<Integer> intercambiar(List<Integer> lista) {
        //error de lista inmutable
        List<Integer> listaMutable = new ArrayList<>(lista);
        listaMutable = listaMutable.stream()
                .collect(Collectors.toList());
        int contador = 0;
        while (contador < listaMutable.size()) {
            if (listaMutable.get(contador) == null) {
                listaMutable.remove(contador);
            }
            contador++;
        }
        if (listaMutable.size() >= 4) {
            Integer auxiliar = listaMutable.get(2);
            listaMutable.set(2, listaMutable.get(4));
            listaMutable.set(4, auxiliar);
        }

        return listaMutable;
    }

//    3) Un metodo recibe una lista de numeros y un numero, la funcion debe agregar el numero al inicio de la lista

    public static List<Integer> agregarElementoAlInicio(List<Integer> lista, Integer numero) {
        //TODO -> implement me
        List<Integer> listaMutable = new ArrayList<>(lista);
        listaMutable = listaMutable.stream()
                .collect(Collectors.toList());
        int contador = 0;
        while (contador < listaMutable.size()) {
            if (listaMutable.get(contador) == null) {
                listaMutable.remove(contador);
            }
            contador++;
        }
        listaMutable.add(0, numero);
        return listaMutable;
    }

    //4) Calcular el promedio de los elementos de una lista

    public static Double promedioLista(List<Integer> lista) {
        //TODO -> implement me
        List<Integer> listaMutable = new ArrayList<>(lista);
        listaMutable = listaMutable.stream()
                .collect(Collectors.toList());
        if (listaMutable != null) {
            int contador = 0;
            while (contador < listaMutable.size()) {
                if (listaMutable.get(contador) == null) {
                    listaMutable.remove(contador);
                }
                contador++;
            }
            Double suma = 0.0;
            for (Integer elemento : listaMutable) {
                if (elemento != null)
                    suma += elemento;
            }
            return suma / listaMutable.size();
        }
        return 0.0;
    }


    //5) Eliminar la posicion donde se encuentre el valor maximo de la lista
    public static List<Integer> eliminarMaximo(List<Integer> lista) {
        //TODO -> implement me
        int valorMax = 0;
        int posicionDeMax = 0;
        List<Integer> listaMutable = new ArrayList<>(lista);
        listaMutable = listaMutable.stream()
                .collect(Collectors.toList());
        if (listaMutable != null) {
            int contador = 0;
            while (contador < listaMutable.size()) {
                if (listaMutable.get(contador) == null) {
                    listaMutable.remove(contador);
                }
                contador++;
            }
            for (Integer elemento : listaMutable) {
                if (valorMax < elemento) {
                    valorMax = elemento;
                    posicionDeMax = listaMutable.indexOf(valorMax);
                }
            }
            listaMutable.remove(posicionDeMax);
        }
        return listaMutable;
    }

    //6) Dadas dos listas, crear una nueva con los elementos que se repitan en ambas
    public static List<Integer> repetidos(List<Integer> a, List<Integer> b) {
        //TODO -> implement me
        List<Integer> nuevaLista = new ArrayList<>();
        if (a != null && b != null) {
            for (Integer elementoA : a) {
                for (Integer elementoB : b) {
                    if (elementoA == elementoB) {
                        nuevaLista.add(elementoA);
                    }
                }
                int contador = 0;
                while (contador < nuevaLista.size()) {
                    if (nuevaLista.get(contador) == null) {
                        nuevaLista.remove(contador);
                    }
                    contador++;
                }
            }
            return nuevaLista;
        }

        return null;
    }

}
