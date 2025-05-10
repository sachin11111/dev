package Inheritance;

import java.util.Optional;

public class Caller {
	
	public static void main(String[] args) {
		
		Parent par = new Child();
		par.get();
		System.out.println(par.age);
		
		Child ch = new Child();
		ch.get();
		ch.getSum();
		
		System.out.println(ch.age);
		String nullValue = null;
		ch.setValue(Optional.ofNullable(nullValue).orElse("sachin"));
		System.out.println(ch.value);
	
	}
	
}
