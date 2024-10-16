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
		System.out.println("ultim valor del array: " + arrayBoolean[arrayBoolean.length - 1]);

		for (int i = 0; i < arrayPrueba2.length; i++) {
			arrayPrueba2[i] = i;
		}
		for (int i = 0; i < arrayPrueba2.length; i++) {
			System.out.println(arrayPrueba2[i] + " ");
		}

		// for (foreach)
		int index = 0;
		for (int element : arrayPrueba2) {
			System.out.println("array[" + index + "]: " + element);
			index++;
		}
		//
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {60, 70, 80, 90, 100};
		System.out.println("\na: " + a);
		for(int i =0; i<a.length;i++) {
			System.out.print("a: " + a[i]);

		}
		
		
		System.out.println("\nb: " + b);
		for(int i =0; i<b.length;i++) {
			System.out.print("b: " + b[i]);

		}
		int[] c = new int[5];
		System.out.println("\nc: " + c);
		for(int i =0; i<c.length;i++) {
			c[i]=a[i]+b[i];
			System.out.print("c: " + c[i]);

		}

	}

}
