package Ejercicio;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listaMusica = new LinkedList<>();

        listaMusica.add("reproducción siguiente");
        listaMusica.add("Bohemian Rhapsody");
        listaMusica.add("Billie Jean");
        listaMusica.add("Hotel California");
        listaMusica.add("Despacito");
        listaMusica.add("Blinding Lights");
        listaMusica.add("Open Hearts");
        listaMusica.add("Imagine");
        listaMusica.add("Wonderwall");
        listaMusica.add("Smells Like Teen Spirit");
        listaMusica.add("Shape of You");

        System.out.println("Mi lista de musica: " + listaMusica);

        listaMusica.removeLast();
        System.out.println("Mi lista de musica (último registro eliminado): " + listaMusica);

        listaMusica.add("Canción 1");
        listaMusica.add("Canción 2");
        listaMusica.add("Canción 3");

        System.out.printf("Mi lista de musica (con tres canciones agregadas: )" + listaMusica);
    }
}