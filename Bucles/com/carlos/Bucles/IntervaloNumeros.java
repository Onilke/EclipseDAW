package com.carlos.Bucles;

	import java.util.Scanner;

	public class IntervaloNumeros {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n1 = 0, n2 = 0;
	        boolean validInput = false;

	        // Solicitar n1
	        while (!validInput) {
	            System.out.print("Introduce un número entero para n1: ");
	            if (scanner.hasNextInt()) {
	                n1 = scanner.nextInt();
	                validInput = true;
	            } else {
	                System.out.println("Error: debes introducir un número entero.");
	                scanner.next();  // Limpiar la entrada incorrecta
	            }
	        }

	        validInput = false;  // Resetear para la segunda entrada

	        // Solicitar n2 y validar que sea mayor que n1
	        while (!validInput) {
	            System.out.print("Introduce un número entero para n2 (n2 > n1): ");
	            if (scanner.hasNextInt()) {
	                n2 = scanner.nextInt();
	                if (n2 > n1) {
	                    validInput = true;
	                } else {
	                    System.out.println("Error: n2 debe ser mayor que n1.");
	                }
	            } else {
	                System.out.println("Error: debes introducir un número entero.");
	                scanner.next();  // Limpiar la entrada incorrecta
	            }
	        }

	        // Mostrar el intervalo
	        System.out.print("[");
	        for (int i = n1; i <= n2; i++) {
	            System.out.print(i);
	            if (i != n2) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	        
	        scanner.close();
	    }
	}
