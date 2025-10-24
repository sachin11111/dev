package com.example.demo.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondLargestOccurred {
	
	public static void main(String[] args) {
		
		findSecondLargestOccurred();
	}

	
	public static void findSecondLargestOccurred() {
		int i[] = {1,1,1,3,3,4,4,4,4,4,4,2,2,2,2,2};
		
		Optional<Entry<Integer, Long>> answer = Arrays.stream(i).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted((x,y) -> (int) (y.getValue() - x.getValue())).skip(1).findFirst();
		//Arrays.stream(i).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().sorted((x,y) -> (int) (y.getValue() - x.getValue())).forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));		
		System.out.println(answer.isPresent() ? answer.get().getKey() : "");
		 
		
	}
		
}