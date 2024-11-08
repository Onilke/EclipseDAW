package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray15 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase = "";
		boolean valida = false;
		String espacio = " ";
		int contador= 0;
		do {
			System.out.println("Introduce una frase:");
			frase = entrada.nextLine().trim();
			if (frase.isEmpty()) {
				System.out.println("No puede estar vacia.");

			} else {
				valida = true;
			}
		} while (!valida);
		System.out.println("La frase introducida es: "+frase);
		Scanner lectorFrase = new Scanner(frase);
		while(lectorFrase.hasNext()) {
			lectorFrase.next();
			contador++;
		}
		System.out.println("La frase tiene "+ contador+ " palabras.");
	}
}
