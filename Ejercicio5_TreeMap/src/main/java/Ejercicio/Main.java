package Ejercicio;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> tempCiudad = new TreeMap<>();

        tempCiudad.put("London", 15);
        tempCiudad.put("Tokyo", 25);
        tempCiudad.put("Cairo", 30);
        tempCiudad.put("Dubai", 35);

        System.out.println("Lista de ciudades: " + tempCiudad);
        // Encontrar la entrada (ciudad y temperatura) con la temperatura más baja
        Optional<Map.Entry<String, Integer>> entradaMasFria = tempCiudad.entrySet().stream()
                .min(Map.Entry.comparingByValue()); // ¡Compara por el VALOR!

        // Encontrar la entrada (ciudad y temperatura) con la temperatura más alta
        Optional<Map.Entry<String, Integer>> entradaMasCalida = tempCiudad.entrySet().stream()
                .max(Map.Entry.comparingByValue()); // ¡Compara por el VALOR!

        // Imprimir los resultados si existen
        entradaMasFria.ifPresent(entry ->
                System.out.println("Ciudad más fría: " + entry.getKey() + " (" + entry.getValue() + "°C)"));

        entradaMasCalida.ifPresent(entry ->
                System.out.println("Ciudad más cálida: " + entry.getKey() + " (" + entry.getValue() + "°C)"));
    }
}