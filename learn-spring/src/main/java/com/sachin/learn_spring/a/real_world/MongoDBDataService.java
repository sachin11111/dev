package com.sachin.learn_spring.a.real_world;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService {
	
	@Override
	public List<Integer> retrieveData() {		
		return Arrays.stream(new int[] {11,22,33,44,55}).boxed().collect(Collectors.toList());
	}
}
