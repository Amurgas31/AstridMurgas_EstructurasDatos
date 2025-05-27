package Ejercicio;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Number> Diccionario = new TreeMap<>();
        System.out.println("--------Diccionario de precios--------");
        //Añadir pares clave-valor
        Diccionario.put("Café", 1.00);
        Diccionario.put("Brownie", 0.75);
        Diccionario.put("Jugo", 0.80);
        System.out.println("TreeMap ordenado: " + Diccionario);
        System.out.println("¿Precio del Jugo? " + Diccionario.get("Jugo"));
        System.out.println("Producto más barato: " + Diccionario.firstKey());
        // --- SOLUCIÓN PARA ENCONTRAR EL PRODUCTO MÁS CARO POR SU PRECIO ---
        String productoMasCaroPorPrecio = "";
        double precioMaximoEncontrado = -1.0; // Inicializamos con un valor que será menor que cualquier precio real
        // Iteramos a través de todas las entradas (pares clave-valor) del mapa
        for (Map.Entry<String, Number> entrada : Diccionario.entrySet()) {
            double precioActual = entrada.getValue().doubleValue(); // Obtenemos el precio actual
            if (precioActual > precioMaximoEncontrado) { // Si el precio actual es mayor que el máximo encontrado hasta ahora
                precioMaximoEncontrado = precioActual; // Actualizamos el precio máximo
                productoMasCaroPorPrecio = entrada.getKey(); // Guardamos la clave (nombre del producto) asociada a ese precio
            }
        }
        System.out.println("Producto más caro: " + productoMasCaroPorPrecio); // Esto imprimirá "Café"
    }
}