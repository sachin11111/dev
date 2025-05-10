package com.sachin.learn_spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.sachin.learn_spring") //if you don't pass the package then by default current package is set
public class DependencyInjectionLauncherApp {

	public static void main (String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApp.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusiness.class).toString());
		}	
	}
}

@Component // This will make sure spring will create a bean for us
class YourBusiness {
	
	@Autowired // This is field based dependency injection
	Dependency1 dep1;
	
	Dependency2 dep2;
	
	Dependency3 dep3;
	
	@Autowired // This is constructor based dependency injection. Note: this annotation is optional.
	public YourBusiness(Dependency3 dep3) {
		super();
		System.out.println("Constructor based dependency injection.");
		this.dep3 = dep3;
	}
	
	public void setDep1(Dependency1 dep1) {
		this.dep1 = dep1;
	}

	@Autowired // This is setter based dependency injection
	public void setDep2(Dependency2 dep2) {
		System.out.println("Setter based dependency injection.");
		this.dep2 = dep2;
	}

	@Override
	public String toString() {
		return dep1 + " " + dep2 + " " + dep3;
	}
}

@Component // This will make sure spring will create a bean for us
class Dependency1 {
	@Override
	public String toString() {
		return "Dependency1";
	}
}

@Component // This will make sure spring will create a bean for us
class Dependency2 {
	@Override
	public String toString() {
		return "Dependency2";
	}
}

@Component // This will make sure spring will create a bean for us
class Dependency3 {
	@Override
	public String toString() {
		return "Dependency3";
	}
}

// Important Points
// 1. Spring recommends Constructor based dependency injection as it dependencies are automatically set.
// 2. @Component annotation is used when we want spring to create and manage beans for us.
// 3. @ComponentScan("com.sachin.learn_spring") if package is not specified then default package is the class where the configuration is defined.

