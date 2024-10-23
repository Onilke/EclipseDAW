package com.carlos.PruebasArray;

import java.util.Random;

public class PruebasArray9 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static void main(String[] args) {
		int[] enters = {45, 3, 74, -34, 12, 20, 66, 43, -101};
		int[] copiaenters = new int [enters.length];
				
		for(int i =0;i<enters.length;i++) {
			copiaenters[i]=enters[i];
		}
		for(int i =0;i<enters.length;i++) {
			System.out.print("Enteros: ");	
			System.out.print(enters[i]);	

			System.out.print("Copiaenteros: ");	
			System.out.print(copiaenters[i]);	

		
		}
		
	}
}
