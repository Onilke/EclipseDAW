package com.carlos.EjerciciosCondicionales1;

import java.util.Scanner;

public class EjerciciosCondicionales2 {

	public static void main(String[] args) {
		int entradaUsuario = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame un numero entero positivo:");
		if (entrada.hasNextInt()) {
			// obtenemos el valor introducido por el teclado
			entradaUsuario = entrada.nextInt();
			entrada.nextLine();
			if (entradaUsuario < 0) {
				System.out.println("El numero introdicido no puede ser negativo.");

			} else {
				if (entradaUsuario % 2 == 0) {
					System.out.println("El numero " + entradaUsuario + " es par.");

				} else {
					System.out.println("El numero " + entradaUsuario + " es impar.");
				}
				if (entradaUsuario % 3 == 0) {
					System.out.println("El numero " + entradaUsuario + " es multiplo de 3.");

				} else {
					System.out.println("El numero " + entradaUsuario + " NO es multiplo de 3.");
				}
				if (entradaUsuario % 5 == 0) {
					System.out.println("El numero " + entradaUsuario + " es multiplo de 5.");

				} else {
					System.out.println("El numero " + entradaUsuario + " NO es multiplo de 5.");
				}
			}

		} else {
			System.out.println("El valor no es valido.");

		}
	}
}
