package com.carlos.PruebasBucles;

public class traza2 {

	public static void main(String[] args) {
		int m=30;
		int i=5;
		do {
			i++;
			m=m+(m%20);
			m-=20;
			System.out.println(m/i);
		}while (m > -20);
		System.out.println("m:"+m);
		
		
		
		
		
		
		
	}
}
