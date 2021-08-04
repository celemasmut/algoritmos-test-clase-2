package com.redbeeacademy.algoritmostest.BuscarElemento;

import java.util.List;

public class BuscarElemento {

    public static boolean devuelvoVerdadero(List<Integer>miLista, int buscado){
        boolean encontrado = false;
        int contador=0;
        while (!encontrado && contador < miLista.size()){
            if(miLista.get(contador).equals(buscado)){
                encontrado=true;
            }
            contador ++;
        }
        return encontrado;
    }
}
