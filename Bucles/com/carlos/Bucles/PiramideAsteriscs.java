package com.carlos.Bucles;

import java.util.Scanner;

public class PiramideAsteriscs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int altura = 0;
		boolean validInput = false;
// Solicitar un valor de tipo entero 
		while (!validInput) {
			System.out.print("Introduce l'alçada de la piràmide (valor positiu): ");
			if (scanner.hasNextInt()) {
				altura = scanner.nextInt();
// Validar que la altura sea un número positivo 
				if (altura > 0) {
					validInput = true;
				} else {
					System.out.println("Error: has d'introduir un valor enter positiu.");
				}
			} else {
				System.out.println("Error: has d'introduir un valor enter.");
				scanner.next(); // Limpiar la entrada incorrecta
			}
		}
// Dibuixar la piràmide 
		for (int i = 0; i < altura; i++) {
// Mostrar espais 
			for (int j = altura - 1; j > i; j--) {
				System.out.print(" "); // Utilitzem el guió per visualitzar espais
			}
// Mostrar asteriscs 
			for (int k = 0; k < (2 * i + 1); k++) {
				System.out.print("*"); // Asteriscs creixents
			}
// Saltar a la següent línia 
			System.out.println();
		}
		scanner.close();
	}
}
