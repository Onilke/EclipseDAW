package com.carlos.PruebasArray;

import java.util.Scanner;

//Un programa que llegeix un nombre conegut de valors enters.
public class EntradaValorsConeguts {
	// Es llegiran 10 valors.
	public static final int NOMBRE_VALORS = 10;

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriu " + NOMBRE_VALORS + " enters. Es pot fer en diferents línies.");
		// Es llegeixen exactament NUM_VALORS valors.
		int nombreValorsLlegits = 0;
		while (nombreValorsLlegits < NOMBRE_VALORS) {
			// Abans de llegir, comprovem si realment hi ha un enter.
			if (entrada.hasNextInt()) {
				// llegim el valor enter i el mostrem en pantalla
				int valor = entrada.nextInt();
				System.out.println("Valor " + (nombreValorsLlegits + 1) + " llegit: " + valor);
				nombreValorsLlegits++; // comptador enters
			} else {
				// Si el valor no és enter, es llegeix però s'ignora.
				// No s'avança tampoc el comptador.
				entrada.next(); // passa al següent token
				System.out.println("Has introduït un valor no enter");
			}
		}
		// Els valors que sobren a l'última línia escrita es descarten.
		entrada.nextLine();
		System.out.println("Ja s'han llegit " + nombreValorsLlegits + " valors.");
		// tanquem l'Scanner
		entrada.close();
	}
}