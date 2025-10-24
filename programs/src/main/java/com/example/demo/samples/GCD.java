package com.example.demo.samples;

public class GCD {
	//GCD or HCF
	//Greatest common divisor or highest common factor
	public void printGCD(int num1, int num2) {
		// we initially set GCD to 1.
		int gcd = 1;
		
		// counter will be the smaller number between 2
		int counter = num1 > num2 ? num1 : num2;

		for (int i = 1; i < counter; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("The GCD or HCF of "+num1+" and "+num2+" is "+gcd+".");

	}

	public static void main(String[] args) {
		new GCD().printGCD(10, 15);
		new GCD().printGCD(30, 40);
		new GCD().printGCD(7, 8);
	}
}
