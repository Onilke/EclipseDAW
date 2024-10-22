package com.carlos.PruebasArray;

public class PruebasArray8 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static final int NOTA = 10;
	public static final int SUSPENDIDO = 5;

	public static void main(String[] args) {
		float[] arrayNotes = { 4.9f, 5.5f, 9f, 10f, 6.7f, 8.2f, 7.5f, 5f, 8.3f, 5.1f, 9f, 7f };
		int insuficiente[] = {};
		insuficiente = new int[5];
		System.out.println("Buscando");
		for (int i = 0; i < arrayNotes.length; i++) {
			if (arrayNotes[i] < 5) {
				insuficiente[0] = +1;
			} else if (arrayNotes[i] <= 6) {
				insuficiente[1] = +1;
			} else if (arrayNotes[i] <= 7) {
				insuficiente[2] = +1;
			} else if (arrayNotes[i] <= 9) {
				insuficiente[3] = +1;
			} else if (arrayNotes[i] == 10) {
				insuficiente[4] = +1;
			}
			else {}
		}
		for (int i =0;i<insuficiente[i];i++) {
			System.out.println(insuficiente[i]);			
		}

	}
}
