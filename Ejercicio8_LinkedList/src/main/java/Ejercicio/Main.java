package Ejercicio;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> historial = new LinkedList<>();
        System.out.println("--------Historial de Navegación--------");

        historial.add("Teams");
        historial.add("Gmail");
        historial.add("Spotify");
        historial.add("YouTube");
        historial.add("Drive");

        // Mostrar historial completo inicial
        System.out.println("Historial completo: " + historial);

        // Simular botón "Atrás" (eliminar la última página)
        historial.removeLast();
        System.out.println("Después de presionar 'Atrás': " + historial);

        // Mostrar historial actual
        System.out.println("Historial actual: " + historial);
    }
}