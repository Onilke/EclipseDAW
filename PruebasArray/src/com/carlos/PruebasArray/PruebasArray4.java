package com.carlos.PruebasArray;

public class PruebasArray4 {
	// Definir una constante que almacena la longitud mínima que debe tener el array

	public static void main(String[] args) {
		float[] arrayNotes = { 4.9f, 5.5f, 9f, 10f, 6.7f, 8.2f, 7.5f, 5f, 8.3f, 5.1f, 9f, 7f };
		float suma = 0;
		for (int i = 0; i < arrayNotes.length; i++) {
			suma = (float) (arrayNotes[i]) + suma;

		}
		System.out.println("Media de las notas: " + suma / arrayNotes.length);

	}
}
