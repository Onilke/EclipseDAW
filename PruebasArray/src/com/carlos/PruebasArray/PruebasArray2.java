package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray2 {
    public static final int LONG_MINIMA = 3;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        boolean longitudValida = false;

        // Bucle para solicitar el número de nombres
        do {
            System.out.println("Dime cuántos nombres quieres introducir: ");
            if (lector.hasNextInt()) {
                int longArray = lector.nextInt();
                lector.nextLine(); // Limpiar el buffer
                if (longArray >= 1) {
                    String[] array = new String[longArray];

                    // Bucle para ingresar los nombres
                    for (int i = 0; i < longArray; i++) {
                        String nombre = ""; // Inicializa la variable para el nombre
                        // Bucle para verificar la longitud del nombre
                        while (true) {
                            System.out.println("Dime el " + (i + 1) + " nombre (mínimo " + LONG_MINIMA + " caracteres): ");
                            nombre = lector.nextLine(); // Leer el nombre
                            if (nombre.length() >= LONG_MINIMA) {
                                array[i] = nombre; // Guardar el nombre en el array
                                break; // Salir del bucle si la longitud es válida
                            } else {
                                System.out.println("Longitud mínima de " + LONG_MINIMA + " no cumplida. Inténtalo de nuevo.");
                            }
                        }
                    }

                    // Mostrar los nombres introducidos
                    System.out.println("Nombres introducidos:");
                    for (String nombre : array) {
                        System.out.println(nombre);
                    }
                    longitudValida = true; // Se han ingresado los nombres correctamente
                } else {
                    System.out.println("Debes introducir al menos un nombre.");
                }
            } else {
                System.out.println("No es un número válido.");
                lector.nextLine(); // Limpiar el buffer en caso de entrada no válida
            }
        } while (!longitudValida); // Repetir hasta que se ingresen nombres válidos

        lector.close(); // Cerrar el Scanner
    }
}

