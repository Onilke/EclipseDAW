package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray7 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static final int NOTA = 10;
	public static final int SUSPENDIDO = 5;

	public static void main(String[] args) {
		char[] arrayCaracters = { 'a', '0', 'g', ';', 'w', 'o', 'h', '+', 'x', 's' };
		Scanner lector = new Scanner(System.in);
		String caracter = "";
		boolean caracterValido = false;
		boolean caracterEncontrado = false;
		int posicionCaracter = 0;
		do {
			System.out.println("Introduce un solo caracter a buscar: ");
			caracter = lector.nextLine();

			if (caracter.length() == 1) {
				caracterValido = true;
			} else {
				System.out.println("Invalido.");
			}
		} while (!caracterValido);
		System.out.println("Caracter introducido: "+caracter);

		for (int i = 0; i < arrayCaracters.length; i++) {
			if(arrayCaracters[i]==caracter.charAt(0)) {
				caracterEncontrado = true;
				posicionCaracter=i;
				break;
			}

		}
		if(caracterEncontrado) {
			System.out.println(
					"Hemos encontrado el caracter " + caracter + " en la posicion " + (posicionCaracter + 1)+".");

		}
		else {
			System.out.println("No hemos encontrado el caracter "+caracter+".");

		}
	}
}
