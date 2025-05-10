package Inheritance;

public class OuterClass {
	
	private int age = 50;
	
	public OuterClass() {
		System.out.println("Parent - Constructor method");
	}
	
	public void get() {
		System.out.println("Parent - get method");
	}
	
	public class InnerClass{
		public void getAge() {
			System.out.println("Age -"+age);
		}	
	}
	
	public void displayInner() {
		InnerClass inner = new InnerClass();
		inner.getAge();
		
		class Handa{
			public void getAge() {
				System.out.println("Age -"+age);
			}
		}
		
		
	}

}
