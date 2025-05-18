package com.sachin.learn_spring.e.xml_configuration;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigAppLauncher {
	
	public static void main(String[] args) {
		
		try (var context = new ClassPathXmlApplicationContext("springContext.xml")) {	
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("str"));
		}
		
	}
}



