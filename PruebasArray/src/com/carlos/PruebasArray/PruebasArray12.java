package com.carlos.PruebasArray;

import java.util.Random;

public class PruebasArray12 {
	// Definir una constante que almacena la longitud mínima que debe tener el array
	public static void main(String[] args) {
		char espacio = ' ';
		String espaciofrase = "";
		String frase = "IES Lluís Simarro" ;
		for(int i=0; i<frase.length(); i++) {
			System.out.println(espaciofrase + frase.charAt(i));
			espaciofrase += espacio;
		}
		
	}
}
