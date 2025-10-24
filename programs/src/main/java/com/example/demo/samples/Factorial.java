package com.example.demo.samples;

public class Factorial {
	
	//Factorial example: 5 --> 1 * 2 * 3 * 4 * 5 = 120
	
	public static void main(String[] args) {
		int num = 5;
		long factorialResult = 1l;
		for(int i = 2; i <= num; ++i)
		{
			factorialResult *= i;
		}
		System.out.println("Factorial: "+factorialResult);
	}

}
