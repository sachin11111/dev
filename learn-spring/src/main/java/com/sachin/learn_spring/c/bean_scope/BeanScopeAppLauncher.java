package com.sachin.learn_spring.c.bean_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class ClassC{
	
}

@Component
@Scope (value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ClassA{
	
}

@Component
class ClassB{
	ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Initialization of ClassB");
		this.classA = classA;
	}
	public ClassA getClassA() {
		return classA;
	}
}

@Configuration
@ComponentScan
public class BeanScopeAppLauncher {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(BeanScopeAppLauncher.class)) {
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
			
			System.out.println(context.getBean(ClassC.class));
			System.out.println(context.getBean(ClassC.class));
			System.out.println(context.getBean(ClassC.class));
			//Spring will return same ClassC object each time it calls get bean as this is singleton see output below
			//com.sachin.learn_spring.c.bean_scope.ClassC@663c9e7a
			//com.sachin.learn_spring.c.bean_scope.ClassC@663c9e7a
			//com.sachin.learn_spring.c.bean_scope.ClassC@663c9e7a

			
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			System.out.println(context.getBean(ClassA.class));
			//Spring will return different ClassA object each time it calls get bean as this is prototype see output below
			//com.sachin.learn_spring.c.bean_scope.ClassA@19e4653c
			//com.sachin.learn_spring.c.bean_scope.ClassA@795509d9
			//com.sachin.learn_spring.c.bean_scope.ClassA@53045c6c
			
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class).getClassA());
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class).getClassA());			
			System.out.println(context.getBean(ClassB.class));
			System.out.println(context.getBean(ClassB.class).getClassA());
			//Spring will return same ClassB object each time it calls get bean as this is prototype see output below
			//Spring wll return same ClassA object each time it calls getClassA as this is instantiated one time when singleton B was initialized.
			//com.sachin.learn_spring.c.bean_scope.ClassB@5149d738 - Object B was created at the time of initialisation
			//com.sachin.learn_spring.c.bean_scope.ClassA@6bbe85a8 - Object A was created at the time of initialisation
			//com.sachin.learn_spring.c.bean_scope.ClassB@5149d738 - Same object B returned
			//com.sachin.learn_spring.c.bean_scope.ClassA@6bbe85a8 - Same object A returned
			//com.sachin.learn_spring.c.bean_scope.ClassB@5149d738 - Same object B returned
			//com.sachin.learn_spring.c.bean_scope.ClassA@6bbe85a8 - Same object A returned
			
		}
		
	}
}



