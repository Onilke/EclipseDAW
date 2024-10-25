package com.carlos.PruebasArray;

//busca l'element més xicotet i el fica al principi
public class BubbleSort {
	public static void main(String[] args) {
		int[] arrayEnters = { 55, 90, 21, 10, 44, 36, 20, 78, 12, 44 };
		int aux = 0; // variable auxiliar per realitzar l'intercanvi

		// El mostrem per pantalla.
		System.out.println("L'array original és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}
		// Bucle extern.

		// en cada iteració guarda la posició del menor valor en una variable auxiliar.
		// quan acaba la iteració, intercanvia aquest valor amb el primer del recorregut
		// actual
		for (int i = 1; i < arrayEnters.length-1; i++) {
			for (int j = 0; j < arrayEnters.length-i; j++) {
				if (arrayEnters[j] < arrayEnters[j + 1]) {
				}
				if (arrayEnters[j] > arrayEnters[j + 1]) {
					aux = arrayEnters[j];
					arrayEnters[j] = arrayEnters[j + 1];
					arrayEnters[j + 1] = aux;
				}
			}

		}

		// El mostrem per pantalla.
		System.out.println("\nL'array ordenat és:");
		for (int i = 0; i < arrayEnters.length; i++) {
			if (i == 0) {
				System.out.print("[" + arrayEnters[i] + ",");
			} else if (i == arrayEnters.length - 1) {
				System.out.print(arrayEnters[i] + "]");
			} else {
				System.out.print(arrayEnters[i] + ",");
			}
		}
	}
}
