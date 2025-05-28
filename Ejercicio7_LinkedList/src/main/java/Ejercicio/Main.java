package Ejercicio;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> listaMusica = new LinkedList<>();
        System.out.println("--------Playlist de Música--------");

        listaMusica.add("Reproducción siguiente");
        listaMusica.add("Let Down");
        listaMusica.add("Skinny");
        listaMusica.add("The Greatest");
        listaMusica.add("The Winner Is...");
        listaMusica.add("We Hug Now");
        listaMusica.add("Creep");
        listaMusica.add("Just a Man");
        listaMusica.add("The Cut That Always Bleeds");
        listaMusica.add("Family Line");
        listaMusica.add("I Can't Handle Change");

        System.out.println("Mi lista de música: " + listaMusica);

        listaMusica.removeLast();
        System.out.println("Mi lista de música (último registro eliminado): " + listaMusica);

        listaMusica.add("Canción 1");
        listaMusica.add("Canción 2");
        listaMusica.add("Canción 3");

        System.out.printf("Mi lista de música (con tres canciones agregadas: )" + listaMusica);
    }
}