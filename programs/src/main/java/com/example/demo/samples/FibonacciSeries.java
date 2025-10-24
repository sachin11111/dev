package com.example.demo.samples;

import java.math.BigInteger;

public class FibonacciSeries {
	public void printFibonacciSeriesInt(int n) {
		int a=0, b=1, c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i =2; i<n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	public void printFibonacciSeriesLong(int n) {
		long a=0, b=1, c;
		System.out.println(a);
		System.out.println(b);
		
		for (int i =2; i<n; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	public void printFibonacciSeriesBigInteger(int n) {
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("1");
		BigInteger c = null;
		
		System.out.println(a);
		System.out.println(b);
		
		for (int i =2; i<n; i++) {
			c = a.add(b);
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	public static void main(String[] args) {
		new FibonacciSeries().printFibonacciSeriesInt(50); // invalid as it goes negative
		new FibonacciSeries().printFibonacciSeriesLong(50);
		new FibonacciSeries().printFibonacciSeriesBigInteger(1000);
	}
	
}
