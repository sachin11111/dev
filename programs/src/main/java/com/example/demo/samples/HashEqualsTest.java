package com.example.demo.samples;

import java.util.HashSet;

public class HashEqualsTest extends HashSet<Employee> {
		
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		Employee e = new Employee(1,"Sachin");
		Employee e1 = new Employee(1,"Sachin");
		
		HashEqualsTest set = new HashEqualsTest();
		set.add(e);
		set.add(e1);

		System.out.println("size= "+set.size());
		System.out.println("equals= "+e.equals(e1));
		System.out.println("e-hash= "+e.hashCode()+" e1-hash= "+e1.hashCode());
		
	}
}

class Employee{
	int id;
	String name;
		
	public Employee(int id,String name) {
		this.id= id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// if you implement following two methods then only set will add single element
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee new_name = (Employee) obj;
			if (this.id==new_name.id && this.name.equals(new_name.name))
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.id;
	}
}