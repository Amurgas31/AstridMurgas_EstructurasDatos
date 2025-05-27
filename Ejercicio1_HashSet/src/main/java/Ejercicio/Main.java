package Ejercicio;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> listUsers = new HashSet<>();
        System.out.println("Lista de usuarios únicos");

        //Añadir Elementos
        listUsers.add("john123");
        listUsers.add("juanito01");
        listUsers.add("pepe14");
        listUsers.add("mateo41");
        listUsers.add("juanito01"); //Dupliacdo

        //Mostrar la cntidad de usuarios únicos hay
        System.out.println("Usuarios únicos dentro de la Lista: " + listUsers);

        //Verificar existencia de un usuario
        System.out.println("¿Existe el usuario 'john123'? " + listUsers.contains("john123"));
    }
}