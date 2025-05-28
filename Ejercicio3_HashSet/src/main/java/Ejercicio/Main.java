package Ejercicio;

import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Set<String> listaPalabras = new HashSet<>();
        System.out.println("--------Filtro de Palabras Repetidas--------");

        listaPalabras.add("hola");
        listaPalabras.add("mundo");
        listaPalabras.add("hola");
        listaPalabras.add("java");

        System.out.println("Lista de palabras (sin palabras repetidas): ");
        for (String palabra : listaPalabras){
            System.out.println(palabra.toUpperCase());
        }
    }
}