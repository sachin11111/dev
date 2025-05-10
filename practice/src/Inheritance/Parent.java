package Inheritance;

public class Parent {
	
	int age = 50;
	
	public final String s = null;
	
	public Parent() {
		System.out.println("Parent - Constructor method");
	}
	
	protected void get() {
		System.out.println("Parent - get method");
	}
	
	
	//overloading	
	public int calculate(int a, int b) {
		return a+b;
	}
	public int calculate(int a, int b, int c) {
		return a+b+c;
	}
	public float calculate(int a, double b) {
		return 0;
	}
	public int calculate(int a, long b) {
		return 0;
	}
	public String calculate(int a, String b) {
		return a+b;
	}

}
