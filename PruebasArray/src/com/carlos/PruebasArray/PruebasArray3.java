package com.carlos.PruebasArray;
public class PruebasArray3 {
    // Definir una constante que almacena la longitud mínima que debe tener el array
    public static final int LONG_MAXIMA = 15; 

    public static void main(String[] args) {
    	int[] array = new int [LONG_MAXIMA];
        int inicio = 1;
        for (int i=1;i<LONG_MAXIMA;i++){
        	inicio = inicio*2; 
        	array[i] = inicio;
        	System.out.print(" "+ array[i]);
        }
    }
}

