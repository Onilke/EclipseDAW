package com.carlos.PruebasArray;

public class PruebasArray6 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static final int NOTA = 10;
	public static final int SUSPENDIDO = 5;

	public static void main(String[] args) {
		float[] arrayNotes = { 2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f };
		/*
		 * float[] arrayNotes = {6f, 5.5f, 9f, 8f, 7f, 8f, 8.5f, 7f, 6.6f, 5f, 9f, 7f};
		 */
		boolean hay10 = false;
		boolean suspendido = false;
		System.out.println("Buscando si hay un 10 o suspenso... ");

		for (int i = 0; i < arrayNotes.length; i++) {
			if (hay10 && suspendido) {
				break;
			} else {
				System.out.println("Nota: " + arrayNotes[i]);
				if (arrayNotes[i] == NOTA) {
					hay10 = true;
				} else if (arrayNotes[i] < SUSPENDIDO) {
					suspendido = true;

				}
			}

		}
		if (hay10) {
			System.out.println("Hay un 10.");

		} else {
			System.out.println("No hay un 10.");
			if (suspendido) {
				System.out.println("Suspendido.");
			} else {
				System.out.println("No ha suspendido.");

			}
		}
	}
}
