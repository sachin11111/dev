package com.jrp.pma.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee {

	@Id // Primary key of the table 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq") 
	@SequenceGenerator(name = "employee_seq", allocationSize = 1)
	//GenerationType.Auto hibernate decides and maintains increments // gives issue if we use data.sql for adding initial inserts
	//GenerationType.Identity depends on database and take increments from db itself a bit slower for batch processing
	private long employeeId;
	
	private String firstName;
	private String lastName;
	private String email;

	//Cascade type defines what happens to Child table when some operations performed to Parent
	//fetch type decides if child should be loaded or not - mostly we use FetchType.LAZY
	//@ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, 
			//fetch = FetchType.LAZY) 
	//@JoinColumn(name = "project_Id")
	//private Project project;
	
	@ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, 
			fetch = FetchType.LAZY) 
	@JoinTable(name = "project_employee", joinColumns = @JoinColumn(name="employee_id"), 
				inverseJoinColumns = @JoinColumn(name="project_id"))
	private List<Project> projects;
		
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
