package com.example.demo.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("Spring/spring.xml");
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring/spring.xml");
		Car car = (Car)appContext.getBean("c");
		car.printCarDetails();
		
		Car bCar = (Car)appContext.getBean("b");
		bCar.printCarDetails();
		
		Test t = (Test)appContext.getBean("t");
		t.hi();
	}
	
}
