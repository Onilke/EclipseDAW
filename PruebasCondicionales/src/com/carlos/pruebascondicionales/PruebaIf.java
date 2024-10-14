package com.carlos.pruebascondicionales;

public class PruebaIf {

	public static void main(String[] args) {

		double hora = 11.11;
		boolean acabar = false;

		if (hora >= 13.45) {
			System.out.println("Nos vamos a casa!");
			// acabar = true;
		}
		/*
		 * if(!acabar) { System.out.println("seguimos!"); }
		 */
		if (hora < 13.45) {
			System.out.println("seguimos!");
			// acabar = true;
		}

	}

}
