package com.sachin.learn_spring.b.lazy_initialization;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}


@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Initialization of ClassB"); // this wont happen at startup as @Lazy is used.
		this.classA = classA;
	}
	public void DoSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationAppLauncher {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("Initialization of context is completed");
			
			context.getBean(ClassB.class).DoSomething(); //here ClassB is going to be initialized
		}
		
	}
}



