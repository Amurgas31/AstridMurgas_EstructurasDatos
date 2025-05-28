package Ejercicio;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------Cola de Atención al Cliente--------");
        LinkedList<String> colaClientes = new LinkedList<>();

        colaClientes.add("Mateo");
        colaClientes.add("Joshua");
        colaClientes.add("Farkle");

        System.out.println("Cola de clientes: " + colaClientes);
        colaClientes.removeFirst();
        System.out.println("Se ha atendido al primer cliente. (Cola de clientes: " + colaClientes + ")");
        colaClientes.addFirst("Adriana (VIP)");
        System.out.println("Se ha agregado un cliente VIP. Será atendido de primero. (Cola de clientes: " + colaClientes + ")");
        System.out.println("El siguiente cliente será: " + colaClientes.get(1));
    }
}