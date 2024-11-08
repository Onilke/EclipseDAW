package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray13 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static final int N_PALABRAS = 5;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[] palabras = new String[N_PALABRAS];
		int contador = 0;
		String palabra = "";
		String aux = "";
		do {
			System.out.println("Escribe una o varias palabras(" + contador + "/" + N_PALABRAS + ")");
			palabra = entrada.next();
			palabras[contador] = palabra;
			contador++;
		} while (contador < N_PALABRAS);
		entrada.nextLine();
		System.out.println("ya hemos introducido las " + N_PALABRAS + " palabras");
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("palabra " + i + ": " + palabras[i]);
		}

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < palabras.length-1-i; j++) {
				if (palabras[j].length() > palabras[j + 1].length()) {
					aux = palabras[j];
					palabras[j] = palabras[j + 1];
					palabras[j + 1] = aux;
				}
				
			}
		}System.out.println("array ordenado de menor a mayor:");
				for (int i = 0; i < palabras.length; i++) {
					System.out.println("palabra " + i + ": " + palabras[i]);}
	}
}
