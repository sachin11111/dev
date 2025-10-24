package com.example.demo.samples;

import java.util.Optional;
import java.util.stream.Stream;

public class TestJava8 {

	public static void main(String[] args) {
		streams();
	}
	
	
	public static void streams() {
		//count() 
		System.out.println(Stream.of(34,35,23,1,56,23,36).count());
		
		//min()
		Optional<String> min = Stream.of("sachin","komal","samisha").min((i,j)->i.length()-j.length());
		min.ifPresent(System.out::println);
		
		//max()
		Optional<Integer> max = Stream.of(34,35,23,1,56,23,36).max((i,j)->i-j);
		max.ifPresent(System.out::println);
	}

}
