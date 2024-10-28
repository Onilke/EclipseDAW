package com.carlos.PruebasArray;

import java.util.Random;
import java.util.Scanner;

public class PruebasArray10 {
	public static final int VALMAX = 20;
	public static final int VALMIN = 1;

	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static void main(String[] args) {
		int nColumnas = 0;
		int nFilas = 0;
		Scanner entrada = new Scanner(System.in);
		boolean entradaValida = false;
		Random aleatorio = new Random();

		do {
			System.out.println("Indica cantidad de filas entre ( " + VALMIN + " y " + VALMAX + " ).");
			
			if (entrada.hasNextInt()) {
				int entradaUsuario = entrada.nextInt();
				if (entradaUsuario <= VALMAX && entradaUsuario >= VALMIN) {
					nFilas = entradaUsuario;
					entradaValida = true;
				} else {
					System.out.println("Entrada no válida!");
				}
			} else {
				System.out.println("Entrada no válida! Por favor ingresa un número entero.");
				entrada.next();
			}

		} while (!entradaValida);
		entradaValida= false;
		do {
			System.out.println("Indica cantidad de Columnas entre ( " + VALMIN + " y " + VALMAX + " ).");
			
			if (entrada.hasNextInt()) {
				int entradaUsuario = entrada.nextInt();
				if (entradaUsuario <= VALMAX && entradaUsuario >= VALMIN) {
					nColumnas = entradaUsuario;
					entradaValida = true;
				} else {
					System.out.println("Entrada no válida!");
				}
			} else {
				System.out.println("Entrada no válida! Por favor ingresa un número entero.");
				entrada.next();
			}

		} while (!entradaValida);
		int[][]matriz= new int[nFilas][nColumnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = 1;
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
