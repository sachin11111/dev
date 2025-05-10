package com.sachin.learn_spring.a.real_world;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public List<Integer> retrieveData() {		
		return Arrays.stream(new int[] {1,2,3,4,5}).boxed().collect(Collectors.toList());
	}
 
}
