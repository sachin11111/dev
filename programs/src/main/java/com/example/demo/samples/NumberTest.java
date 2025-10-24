package com.example.demo.samples;

public class NumberTest {

	public static void main(String[] args) {
		
		System.out.println("Math.min(Integer.MIN_VALUE, 0.0d) 	===> " + Math.min(Integer.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Long.MIN_VALUE, 0.0d) 		===> " + Math.min(Long.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Float.MIN_VALUE, 0.0d) 	===> " + Math.min(Float.MIN_VALUE, 0.0d));
		System.out.println("Math.min(Double.MIN_VALUE, 0.0d) 	===> " + Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println("1.0 / 0.0 ===> " + (1.0 / 0.0)); // result is infinite
		//System.out.println("1 / 0 ===> " + (1 / 0)); // Divide by 0 error
		
		// Numeric promotion rules
		//1. java promotes small datatype to large
		//2. for binary arithmatic byte,short,char are first converted to int
		
		short Short = 5;
		float Float = 4.5f; // if f not added at the end compilation error
		System.out.println(Short + Float);
		String String = "String"; // allowed
		//short short = 1; compilation error short can not be used
		
		char a = 'a';
		char b = 'b';
		int c = a+b;
		System.out.println(a + b + c);
		System.out.println(a + b);
		System.out.println(a +""+ b +""+ c);
	}	
}
