package com.carlos.Bucles;

import java.util.Scanner;

public class ContarXifres {

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
				scanner.next(); // Limpiar la entrada incorrecta
			}
		}

		// Calcular el número de cifras
		int xifres = 0;
		int numeroAbs = Math.abs(numero); // Valor absoluto del número

		// Especial caso para 0
		if (numeroAbs == 0) {
			xifres = 1;
		} else {
			while (numeroAbs > 0) {
				numeroAbs /= 10; // Dividir por 10 para eliminar una cifra
				xifres++; // Aumentar el contador de cifras
			}
		}

		// Mostrar el resultado
		System.out.println(numero + " té " + xifres + (xifres == 1 ? " xifra" : " xifres"));

		scanner.close();
	}
}
