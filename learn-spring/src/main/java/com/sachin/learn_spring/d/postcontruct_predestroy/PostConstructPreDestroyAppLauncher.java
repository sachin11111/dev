package com.sachin.learn_spring.d.postcontruct_predestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDepedency someDepedency;
	
	public SomeClass(SomeDepedency someDepedency) {
		super();
		this.someDepedency = someDepedency;
		System.out.println("All dependecies are ready");
	}
	
	//The PostConstruct annotation is used on a method that needs to be executed after dependency injection is done to perform any initialization. 
	//This method must be invoked before the class is put into service.
	@PostConstruct  
	public void initialize() {
		someDepedency.getReady();
	}
	
	
	//The PreDestroy annotation is used on a method as a callback notification to signal that the instance is in the process of being removed by the container. 
	//The method annotated with PreDestroy is typically used to release resources that it has been holding
	@PreDestroy
	public void cleanup() {
		//any connection to DB or any context that can be closed here.
		System.out.println("Cleanup is completed");	
	}
}

@Component
class SomeDepedency{

	public void getReady() {
		System.out.println("Data is fetched from DB and is available to use");	
	}
	
}

@Configuration
@ComponentScan
public class PostConstructPreDestroyAppLauncher {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(PostConstructPreDestroyAppLauncher.class)) {	
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
					
			System.out.println(context.getBean(SomeClass.class));
		}
		
	}
}



