package com.carlos.PruebasArray;

import java.util.Scanner;

public class PruebasArray14 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra = "";
		String albercoc = "a";
		String banana = "b";
		String coco = "c";
		boolean valorCorrecto = false;
		do {
			System.out.println("elige: a) Albercoc b) Banana c) Coco");
			letra = entrada.nextLine().trim().toLowerCase();
			if (letra.length() != 1) {
				System.out.println("Intoroduce solo una letra.");
			} else {
				switch (letra) {
				case "a", "b", "c":
					valorCorrecto = true;
					break;
				default:
					System.out.println("Introduce solo una letra. 'a,b,c'");
				}

			}

		} while (!valorCorrecto);

		switch (letra) {
		case "a" -> System.out.println("Albercoc");
		case "b" -> System.out.println("Banana");
		case "c" -> System.out.println("Coco");
		}
	}
}
