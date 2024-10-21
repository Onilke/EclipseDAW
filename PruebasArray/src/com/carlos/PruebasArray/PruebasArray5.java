package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray5 {
	// Definir una constante que almacena la longitud mínima que debe tener el array

	public static void main(String[] args) {
		float suma = 0;
		Scanner lector = new Scanner(System.in);
		System.out.println("Dime el numero de notas a introducir: ");
		int longitudArray = lector.nextInt();
		float[] arrayNotes = new float[longitudArray];
		for (int i = 0; i < longitudArray; i++) {
			System.out.println("Dime la " + (i + 1) + "ª nota: ");
			arrayNotes[i] = lector.nextFloat();

		}
		for (int i = 0; i < arrayNotes.length; i++) {
			suma = (float) (arrayNotes[i]) + suma;
			System.out.println("Nota " + (i + 1) + ": " + (arrayNotes[i]));
		}

		System.out.println("Media de las notas: " + suma / arrayNotes.length);

	}
}
