package com.sachin.learn_spring.a.real_world;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationService {

	@Autowired 
	@Qualifier ("mySQLDataService")
	DataService dataService;
	
	public int getMax () {
		return (int) dataService.retrieveData().stream().max((o1, o2) -> o1 - o2).orElse(0);
	}
}
