package com.carlos.PruebasBucles;

public class traza6 {

	public static void main(String[] args) {
	int p=10;
	int sum=0;
	for(int k=1;k<10;k++) {
		if((p%k)%2==0) {
			sum+=k; 
		}
	}
System.out.println("SUM:"+sum);
	}

}
