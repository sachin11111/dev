package com.example.demo.samples;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(checkAnagram("sachin", "sachin"));
	}
	
	public static boolean checkAnagram(String string1, String string2) {
		if(string1.length() == string2.length()) {
			// convert strings to char array
			char[] characterArray1 = string1.toCharArray();
			char[] characterArray2 = string2.toCharArray();
			// sort the arrays
			Arrays.sort(characterArray1);
			Arrays.sort(characterArray2);
			// check for equality, if found equal then anagram, else not an anagram
			return Arrays.equals(characterArray1, characterArray2);
		}
		return false;
	}

}
