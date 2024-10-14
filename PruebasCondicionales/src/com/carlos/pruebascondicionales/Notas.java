package com.carlos.pruebascondicionales;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		float notaUsuario = 0.0f;
		System.out.println("Dime tu nota (0-10): ");
		if (entrada.hasNextFloat()) {
			// obtenemos el valor introducido por el teclado
			notaUsuario = entrada.nextFloat();
			//limitamos el float que sea entre 0-10
			if ((notaUsuario >= 0) && (notaUsuario <= 10)) {
				// mostramos el numero introducido
				System.out.println("Tu nota es: " + notaUsuario);
				// comparamos el numero introducido si es menor que 5
				if (notaUsuario < 5) {
					System.out.println("Suspendido");
					// si no pasa a la siguiente funcion de si es menor que 6...
				} else if (notaUsuario < 6) {
					System.out.println("Sufuciente");
				} else if (notaUsuario < 7) {
					System.out.println("Bien");
				} else if (notaUsuario < 9) {
					System.out.println("Notable");
				} else {
					System.out.println("Excelente");
				}

			} else {
				System.out.println("La nota tiene que estar entre 0-10");

			}
		}
		else {
			System.out.println("Entrada no valida");}

	}
}
