package com.carlos.Bucles;
import java.util.Scanner;

public class MajorDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean validInput = false;

        // Solicitar un número entero positivo mayor que 1
        while (!validInput) {
            System.out.print("Introduce un número entero positivo mayor que 1: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (numero > 1) {
                    validInput = true;
                } else {
                    System.out.println("Error: el número debe ser mayor que 1.");
                }
            } else {
                System.out.println("Error: debes introducir un número entero.");
                scanner.next();  // Limpiar la entrada incorrecta
            }
        }

        // Variable de control (semáforo) para saber si se ha encontrado divisor
        boolean divisorEncontrado = false;

        // Buscar el mayor divisor positivo distinto de él mismo y de 1
        for (int i = numero / 2; i > 1; i--) {
            if (numero % i == 0) {
                System.out.println("El mayor divisor de " + numero + " es: " + i);
                divisorEncontrado = true;
                break;  // Salir del bucle una vez encontrado el mayor divisor
            }
        }

        // Si no se ha encontrado ningún divisor
        if (!divisorEncontrado) {
            System.out.println("El nombre " + numero + " no té divisors, és un nombre primer.");
        }

        scanner.close();
    }
}
