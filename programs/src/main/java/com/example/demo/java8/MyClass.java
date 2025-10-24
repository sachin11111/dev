package com.example.demo.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyClass {
	
	public static void main(String args[]) 
    { 
        int a = 5; 
  
        // lambda expression to define the calculate method 
        Square s = (int x) -> (x*x); 
  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.calculate(a); 
        System.out.println(ans); 
        
        Predicate<Integer> pred = new Predicate<Integer>() {
			@Override
			public boolean test(Integer arg0) {
				return arg0%2==0;
			}
		};
		
		Consumer<Integer> consume = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer arg0) {
				System.out.println(arg0);				
			}
		};
        
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(1);
		array.add(2);
		array.add(1);

		array.add(2);
		array.add(1);

		array.add(2);
		array.add(1);

		array.add(2);
		array.add(1);

        Stream<Integer> stream = array.stream();
        boolean anyMatch = stream.anyMatch(pred);
        array.stream().filter(x->x%2==0).forEach(consume);
        System.out.println(anyMatch);
        
    } 
}

