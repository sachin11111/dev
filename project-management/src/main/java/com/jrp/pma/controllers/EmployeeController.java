package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.entities.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	// 01 ====== field injection ======
	@Autowired
	EmployeeRepository empRep;
	
	// 02 ====== constructor injection ======
	//For constructor injection we DO NOT NEED @Autowired
	//EmployeeRepository can be injected through constructor injection like below
	/*
	public EmployeeController (EmployeeRepository empRep) {
		this.empRep = empRep;
	}
	*/
	
	// 03 ====== setter injection ======
	//for setter injection we NEED @Autowired
	//EmployeeRepository can be injected through setter injection like below
	/*
	@Autowired
	public void setEmpRep (EmployeeRepository empRep) {
		this.empRep = empRep;
	}
	*/
	
	@GetMapping
	public String displayEmployees(Model model) {
		List<Employee> list = empRep.findAll();
		model.addAttribute("employees", list);
		return "employee/list-employees";
	}

	@GetMapping("/new")
	public String displayEmployeeForm(Model model, boolean redirect) {
		Employee emp = new Employee();
		model.addAttribute("employee", emp);
		model.addAttribute("redirect", redirect);
		return "employee/new-employee";
	}
	
	@PostMapping("/save")
	public String createEmployee(Model model, Employee emp, RedirectAttributes att) {
		// this should handle saving to database...
		empRep.save(emp);
		
		att.addAttribute("redirect", true);
		//use a redirect to prevent duplicate submissions
		return "redirect:/employees/new";
	}
}
