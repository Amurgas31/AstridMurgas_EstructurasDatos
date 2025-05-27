package Ejercicio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String>  barCodes = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        int op;
        do{
        System.out.println("--------Control de asistentes a un evento--------");
        System.out.println("Selecciones una opción:");
        System.out.println("1. Registrar código de barras de un nuevo participante.");
        System.out.println("2. Mostrar la lista de asistentes únicos");
        op = scan.nextInt();
            switch (op){
                case 1:
                    System.out.println("Ingrese el código de barras del nuevo participante:");
                    scan.nextLine();
                    String barCode = scan.nextLine();
                    if (barCodes.contains(barCode)){
                        System.out.println("Este código ya esta registrado");
                        break;
                    }
                    else {
                        barCodes.add(barCode);
                        break;
                    }

                case 2:
                    System.out.println("Lista de asistentes únicos: " + barCodes);
                    break;

                default:
                    System.out.println("Operación invalida");
                    break;
            }
        }while (op <= 2);
    }
}