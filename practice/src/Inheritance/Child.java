package Inheritance;

public class Child extends Parent implements Interface {
	static int staticVeriable;
	int instanceVeriable;
	int age = 20;
	String value = null;
	
	public Child() {
		System.out.println("Child - Constructor method");
	}
	
	public void get() {
		System.out.println("Child - get method");
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	static {
		System.out.println("static");
	}
	
	
	public static int getCube() {
		return staticVeriable*staticVeriable*staticVeriable;
	}

	@Override
	public int getCube(int multiplier) {
		return multiplier * multiplier * this.multiplier;
	}
	
	@Override
	public void getSum() {
		//Interface.super.getSum();
		System.out.println("Child - getSum method"); 
	}
}


interface Interface{
	int multiplier = 5;
	public int getCube(int multiplier);
	
	public default void getSum() {
		System.out.println("interface - getSum method"); 
	}
	
	public static void getStatic() {
		System.out.println("Static get method"); 
	}
	
}
