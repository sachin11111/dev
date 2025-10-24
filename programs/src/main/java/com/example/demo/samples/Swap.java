package com.example.demo.samples;

public class Swap {

	public static void swapWithoutOverflow() {

		System.out.println("Swapping without overflow");

		int a = Integer.MAX_VALUE;
		int b = 10;
		
		System.out.println("Before swapping a = "+a+" and b = "+b);
		
		a = a ^ b;
		System.out.println("a = a ^ b ==> "+a);

		b = a ^ b;
		System.out.println("b = a ^ b ==> "+b);

		a = a ^ b;
		System.out.println("a = a ^ b ==> "+a);

		
		System.out.println("After swapping a = "+a+" and b = "+b);		
	}
	
	public static void swap() {
		
		System.out.println("Swapping with overflow");
		
		int a = Integer.MAX_VALUE;
		int b = 10;
		
		System.out.println("Before swapping a = "+a+" and b = "+b);
		
		a = a + b;
		System.out.println("a = a + b ==> "+a);
		
		b = a - b;
		System.out.println("b = a - b ==> "+b);

		a = a - b;
		System.out.println("a = a - b ==> "+a);

		
		System.out.println("After swapping a = "+a+" and b = "+b);
	}
	
	
	public static void main(String[] args) {
		swap();
		System.out.println("");
		swapWithoutOverflow();
	}	
}
