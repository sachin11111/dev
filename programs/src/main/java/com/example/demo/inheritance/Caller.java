package com.example.demo.inheritance;

public class Caller {
	
	public static void main(String[] args) {
		
		Parent par = new Child();
		par.get();
		System.out.println(par.age);
		
		Child ch = new Child();
		ch.get();
		System.out.println(ch.age);
	
	}
}
