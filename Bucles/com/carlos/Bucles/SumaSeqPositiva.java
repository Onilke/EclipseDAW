package com.carlos.Bucles;
import java.util.Scanner;

public class SumaSeqPositiva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean validInput = false;

        // Solicitar un número entero
        while (!validInput) {
            System.out.print("Introduce un número entero: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Error: debes introducir un número entero.");
                scanner.next();  // Limpiar la entrada incorrecta
            }
        }

        int suma = 0;
        int i = 0;

        // Sumar números positivos hasta que la suma sea mayor que el número
        while (suma + i < numero) {
            suma += i; // Agregar el número actual a la suma
            i++; // Incrementar para el siguiente número
        }

        // Mostrar el resultado
        System.out.print("Número " + numero + ": cal sumar ");
        for (int j = 0; j < i; j++) {
            System.out.print(j);
            if (j < i - 1) {
                System.out.print(" "); // Espacio entre números
            }
        }
        System.out.println(" per obtenir el número " + suma + ".");

        scanner.close();
    }
}
