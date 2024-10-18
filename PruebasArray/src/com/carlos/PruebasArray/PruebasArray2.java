package com.carlos.PruebasArray;

import java.util.Scanner; // Importar la clase Scanner para poder leer datos desde la consola
import java.util.Random;
public class PruebasArray2 {
    // Definir una constante que almacena la longitud mínima que debe tener cada nombre
    public static final int LONG_MINIMA = 3; 

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner lector = new Scanner(System.in); 

        // Variable booleana que controla si el número de nombres introducido es válido
        boolean longitudValida = false; 
        
        Random aleatorio = new Random();

        // Bucle externo que se repite hasta que el usuario introduzca un número válido de nombres
        do {
            // Pedir al usuario que indique cuántos nombres quiere introducir
            System.out.println("Dime cuántos nombres quieres introducir: "); 

            // Comprobar si la entrada del usuario es un número entero
            if (lector.hasNextInt()) { 
                // Leer el número entero que representa cuántos nombres quiere introducir el usuario
                int longArray = lector.nextInt(); 
                // Limpiar el buffer del Scanner para evitar problemas con la siguiente entrada
                lector.nextLine(); 

                // Comprobar si el número de nombres introducido es válido (debe ser mayor o igual a 1)
                if (longArray >= 1) {
                    // Crear un array de cadenas para almacenar los nombres que introducirá el usuario
                    String[] array = new String[longArray]; 

                    // Bucle que itera tantas veces como el número de nombres que el usuario quiere introducir
                    for (int i = 0; i < longArray; i++) {
                        // Inicializar una variable vacía donde se almacenará temporalmente el nombre ingresado por el usuario
                        String nombre = ""; 
                        // Variable booleana que controla si el nombre ingresado es válido (cumple con la longitud mínima)
                        boolean nombreValido = false; 

                        // Bucle que pide al usuario un nombre hasta que cumpla con la longitud mínima
                        do {
                            // Pedir al usuario que introduzca un nombre con una longitud mínima
                            System.out.println("Dime el " + (i + 1) + " nombre (mínimo " + LONG_MINIMA + " caracteres): "); 
                            
                            // Leer el nombre que introduce el usuario
                            nombre = lector.nextLine(); 

                            // Comprobar si el nombre tiene la longitud mínima requerida
                            if (nombre.length() >= LONG_MINIMA) { 
                                // Si el nombre es válido, almacenarlo en el array
                                array[i] = nombre; 
                                // Cambiar la variable booleana a true para indicar que el nombre es válido y salir del bucle
                                nombreValido = true; 
                            } else {
                                // Si el nombre no cumple con la longitud mínima, mostrar un mensaje de error
                                System.out.println("Longitud mínima de " + LONG_MINIMA + " no cumplida. Inténtalo de nuevo.");
                            }
                        // El bucle `do-while` se repite hasta que `nombreValido` sea true (es decir, hasta que el nombre sea válido)
                        } while (!nombreValido); 
                    }

                    // Una vez que se han ingresado todos los nombres, mostrar los nombres introducidos
                    System.out.println("Nombres introducidos:");
                    // Bucle para recorrer el array y mostrar cada nombre en la consola
                    for (String nombre : array) {
                        System.out.println(nombre); 
                    }
       

                    // Cambiar la variable `longitudValida` a true para indicar que todo el proceso se completó correctamente
                    longitudValida = true; 
                 // Generar y mostrar el nombre del alumno premiado
                    System.out.println("El alumno premiado es: ");
                    // Elegir un nombre aleatorio de la lista de nombres introducidos
                    System.out.println(array[aleatorio.nextInt(longArray)]); 
                } else {
                    // Si el número de nombres introducido es menor que 1, mostrar un mensaje de error
                    System.out.println("Debes introducir al menos un nombre.");
                }
                
            } else {
                // Si la entrada del usuario no es un número entero, mostrar un mensaje de error
                System.out.println("No es un número válido.");
                // Limpiar el buffer del Scanner para que pueda aceptar nuevas entradas
                lector.nextLine(); 
            }
        // El bucle `do-while` se repite hasta que `longitudValida` sea true (es decir, hasta que todo el proceso sea correcto)
        } while (!longitudValida); 
        lector.close();
    }
}

