package com.example.demo.samples;

import java.util.ArrayList;

public class PrimeFactor {
	
	// prime factors ex: 15 --> 2, 2, 3
	
	public ArrayList<Integer> getPrimeFactors(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 2; i<=n; i++) {
			while(n%i==0) {
				list.add(i);
				n=n/i;
			}
		}
		
		if (n>2)
			list.add(n);
		
		return list;
	}
	
	public static void main(String[] args) {
		PrimeFactor primeFactor = new PrimeFactor();
		ArrayList<Integer> list = primeFactor.getPrimeFactors(12);
		list.forEach(i -> System.out.println(i));
	}

}
