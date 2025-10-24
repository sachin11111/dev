package com.example.demo.spring;
import java.util.Set;

public class Test {

	String message;
	int age;
	int std;
	Set<String> sachin;
	
	public void setSachin(Set<String> sachin) {
		this.sachin = sachin;
	}
	
	public Test() {
		System.out.println("Constructor------");
	}
	
	public Test(String message, int age, int std) {
		this.message = message;
		this.age = age;
		this.std = std;
		System.out.println("PARAM Constructor------");
	}
	
	public void helloWorld() {
		System.out.println("Hello World...!!!");
	}

	public void hello(String message) {
		System.out.println(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	public void hi() {
		System.out.println(message + " " + age + " " + std);
		System.out.println(sachin.size());
		System.out.println(sachin.toString());
	}
	
}
