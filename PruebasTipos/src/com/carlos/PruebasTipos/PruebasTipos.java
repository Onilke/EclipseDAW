package com.carlos.PruebasTipos;

public class PruebasTipos {
	// programa principal

	public static void main(String[] args) {
		
		//void: Indica que un método no devuelve ningún valor.
		//final: Hace que una variable sea constante (su valor no puede cambiar) o que un método/clase no pueda ser sobrescrito/heredada.

		// declaración de variable
		// boleanos
		boolean var1 = true;
		boolean var2 = false;
		// enteros
		byte varByte1 = 127; // maximo 127 minimo -128
		short varShort1 = 32767; // maximo 32767 minimo -32768
		int varInt1 = 2147483647, varInt2 = -2147483648; // maximo 2147483647 minimo -2147483648
		long varLong1 = 2147483647; // maximo 2147483647 minimo -2147483648
		// reales
		float varfloat = 3.100004f;
		double vardouble = 56.000000000000014;
		//characters (char)
		char varb = '€';
		char varcorasao = '\u2764';
		
		//string
		String varjaja = "jaja" ;
		String varseta = "\uD83C\uDF44";
		String varcongelado = "\uD83E\uDD76";

		System.out.println("Valor de la variable var1: " + var1 + ";");
		// println salto de linea
		// print sin salto de linea
		System.out.println("Valor de la variable var2: " + var2 + ".");
		// cntrl+shift+f Ordenar lineas
		System.out.println("Valor de var3: " + varInt1);
		System.out.println("Valor de varfloat: " + varfloat);
		System.out.println("Valor de vardouble: " + vardouble);
		System.out.println("Valor de varb: " + varb);
		System.out.println("Valor de varjaja: " + varjaja);
		System.out.println("corasao: " + varcorasao);
		System.out.println("seta: " + varseta);
		System.out.println("congelado: " + varcongelado);

	}

}
