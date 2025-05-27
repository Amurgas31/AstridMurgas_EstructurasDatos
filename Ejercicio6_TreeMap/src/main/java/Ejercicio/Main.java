package Ejercicio;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Ranking de puntajes--------");
        TreeMap<String, Number> ranking = new TreeMap<>();
        //Añadir pares clave-valor
        ranking.put("van Dijk", 89);
        ranking.put("Cristiano Ronaldo", 86);
        ranking.put("Mbappé", 91);
        ranking.put("Messi", 88);
        ranking.put("Raphinha", 84);
        System.out.println("Jugadores ordenados: " + ranking);
        // Encontrar al jugador con el puntaje más alto
        String jugadorConPuntajeMasAlto = null;
        double puntajeMasAlto = -1; // Inicializamos con un valor bajo
        for (Map.Entry<String, Number> entrada : ranking.entrySet()) {
            double puntajeActual = entrada.getValue().doubleValue();
            if (puntajeActual > puntajeMasAlto) {
                puntajeMasAlto = puntajeActual;
                jugadorConPuntajeMasAlto = entrada.getKey();
            }
        }
        System.out.println("El jugador con el puntaje más alto es: " + jugadorConPuntajeMasAlto + " con " + (int) puntajeMasAlto + " puntos.");
    }
}