package com.example.demo.samples;

import java.math.BigInteger;

public class AddTwoVeryLongNumbers {
	public static void main(String args[]){
		String a = "123456789012345678901234567890";
		String b = "123456789012345678901234567890";
		printAddition(a, b);
		
		String c = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";
		String d = "123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890";		
		printAddition(c, d);
		
	}
	
	
	public static void printAddition(String a, String b) {
		String s = addWithoutBigInt(a,b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(s + " addition using addWithoutBigInt");

		s = addWithBigInt(a,b);
		System.out.println(s + " addition using addWithBigInt");
	}
	
	
	public static String addWithoutBigInt(String a,String b) {
		String result = "";
		int s =  a.length() >= String.valueOf(Integer.MAX_VALUE).length()-1 ? String.valueOf(Integer.MAX_VALUE).length()-1 : a.length();//split counter

		String aa;
		String bb;
		String imdResult;
		int carry = 0;
		
		while(s!=0) {
			aa = a.substring(a.length()-s,a.length()); 
			bb = b.substring(b.length()-s,b.length());
			
			imdResult = String.valueOf((Integer.parseInt(aa) + Integer.parseInt(bb) + carry));
			carry = imdResult.length() > s ? 1 : 0;
			imdResult = imdResult.length() > s ? imdResult.substring(1, imdResult.length()) : imdResult;
			
			a = a.substring(0,a.length()-s); 
			b = b.substring(0,b.length()-s);
			
			result = imdResult + result;
			
			if(a.length() < s)
				s = a.length();				
							
			if(s==0) {
				if(carry > 0) result = carry + result;
				break;
			}
		}
		
		return result;
	}
	
	public static String addWithBigInt(String a,String b) {
		BigInteger num1 = new BigInteger(a);
		BigInteger num2 = new BigInteger(b);
		return num1.add(num2).toString();
	}
	
}

