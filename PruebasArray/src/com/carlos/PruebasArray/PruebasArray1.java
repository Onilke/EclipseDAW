package com.carlos.PruebasArray;

public class PruebasArray1 {

	public static void main(String[] args) {
		int[] arrayPrueba = { 1, 2, 3, 4, 5 };
		int[] arrayPrueba2 = new int[10];
		boolean[] arrayBoolean = new boolean[100];

		arrayPrueba[3] = 10;
		arrayBoolean[99] = true;

		System.out.println(arrayPrueba[0]);
		System.out.println(arrayBoolean[0]);
		System.out.println("ultim valor del array: " +arrayBoolean[arrayBoolean.length-1]);

		for(int i =0;i<arrayPrueba2.length;i++){
			arrayPrueba2[i]=i;
			}
		for(int i =0;i<arrayPrueba2.length;i++){
			arrayPrueba2[i]=i;
			}
		for(int i =0;i<arrayPrueba2.length;i++){
			System.out.print(arrayPrueba2[i]+" ");
			}
	}

}
