package com.carlos.PruebasArray;

import java.util.Random;

public class PruebasArray8 {
	// Definir una constante que almacena la longitud mínima que debe tener el array

	public static final float NOTA_MAX=10.0f;
	public static final float NOTA_MIN=0.0f;
	public static final int LONG_ARRAY=100;

	public static void main(String[] args) {
		/*float[] arrayNotes = { 4.9f, 5.5f, 9f, 10f, 6.7f, 8.2f, 7.5f, 5f, 8.3f, 5.1f, 9f, 7f };*/
		float[] arrayNotes = new float [LONG_ARRAY];
		Random aleatorio = new Random();
		int arraySumaNotes[] = {};
		arraySumaNotes = new int[5];
		
		for (int i = 0; i<LONG_ARRAY;i++) {
			arrayNotes[i]= aleatorio.nextFloat(NOTA_MIN,NOTA_MAX);
			
		}
		
		System.out.println("Notas:");
		for (int i = 0; i < arrayNotes.length; i++) {
			if (arrayNotes[i] < 5) {
				arraySumaNotes[0] += 1;
			} else if (arrayNotes[i] <= 6) {
				arraySumaNotes[1] += 1;
			} else if (arrayNotes[i] <= 7) {
				arraySumaNotes[2] += 1;
			} else if (arrayNotes[i] <= 8) {
				arraySumaNotes[3] += 1;
			} else if (arrayNotes[i] <= 9) {
				arraySumaNotes[4] += 1;
			} else {
			}
		}
		for (int i = 0; i < arraySumaNotes.length; i++) {
			if (i == 0) {
				System.out.print("Insuficiente: ");
			} else if (i == 1) {
				System.out.print("Aprovado:     ");
			} else if (i == 2) {
				System.out.print("Bien:         ");
			} else if (i == 3) {
				System.out.print("Notable:      ");
			} else if (i == 4) {
				System.out.print("Excelente:    ");
			}
			for (int j = 0; j < arraySumaNotes[i]; j++) {
				System.out.print("*");
		}
			System.out.println("");
		}
		
	}
}
