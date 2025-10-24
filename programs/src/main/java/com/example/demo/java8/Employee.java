package com.example.demo.java8;

public class Employee {
	int age;
	String name;
	String gender;
	int salary;
	
	public Employee(int age, String name, String gender, int salary) {
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}