package com.carlos.PruebasArray;

public class PruebasArray3 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static final int LONG_MAXIMA = 15;

	public static void main(String[] args) {
		/*
		 * int[] array = new int [LONG_MAXIMA]; int inicio = 1;
		 * System.out.print(inicio); for (int i=1;i<LONG_MAXIMA;i++){ inicio = inicio*2;
		 * array[i] = inicio; System.out.print(" "+ array[i]); }
		 */
		int[] arrayDobles = new int[LONG_MAXIMA];
		arrayDobles[0] = 1;
		for (int i = 1; i < arrayDobles.length; i++) {
			arrayDobles[i] = (arrayDobles[i - 1] * 2);
		}
		System.out.print("[");
		for (int i = 0; i < arrayDobles.length; i++) {
			if (i == arrayDobles.length - 1) {
				System.out.print(arrayDobles[i] + "]");
			} else {
				System.out.print(arrayDobles[i] + ", ");
			}
		}
	}
}
