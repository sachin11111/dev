package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperations {
	
	public static void main(String[] args) {
		
		executeStreamOperations();

	}
	
	
	/*
	 * Intermediate operations: map, filter, sorted
	 * Terminal operations: collect, forEach, reduce
	 * 
	 */
	
	public static void executeStreamOperations() {
		Employee one = new Employee(10, "Samisha", "F", 200);
		Employee two = new Employee(12, "Sachin", "M", 100);
		Employee three = new Employee(12, "Komal", "F", 300);
		Employee four = new Employee(14, "Rani", "F", 150);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		
		// find average salary of Females 
		System.out.println(list.stream().filter(a -> a.getGender().equals("F")).mapToInt(a -> a.salary).average());	
		
		// create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5); 
        
        // demonstration of map method // new list with squares of each
        List<Integer> square = number.stream()
            .map(x -> x * x)
            .collect(Collectors.toList());

        square.stream().forEach(a -> System.out.print(a + " "));
        square.stream().forEach(System.out::print);
        
        // forEach vs forEachOrdered in Java 8 Stream
        square.stream().forEachOrdered(a -> System.out.println(a + " "));
	}
	
}