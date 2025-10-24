package com.example.demo.samples;

import java.util.Stack;

public class StackTest {

	
	public static boolean checkIfBalanced(String string) {
		
		if(string==null || string.length()%2 != 0)
			return false;
		
		Stack<Character> stack = new Stack<Character>();
		
		for (char ch : string.toCharArray()) {
			
			switch (ch) {
			
			case '{':
				stack.push(ch);
				break;
			case '(':
				stack.add(ch);
				break;
			case '}':
				char chs = stack.pop();
				if(chs!='{') {
					return false;
				}
				break;
			case ')':
				chs = stack.pop();
				if(chs!='(') {
					return false;
				}
				break;
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		System.out.print(checkIfBalanced("{}{}{}{}{}{}{}{}{}"));
		System.out.print(checkIfBalanced("{)}()(){)}"));
	}
		
}

