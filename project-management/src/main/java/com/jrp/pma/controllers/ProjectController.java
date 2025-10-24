package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.entities.Employee;
import com.jrp.pma.entities.Project;

@Controller
@RequestMapping("/projects")
public class ProjectController {
	
	//give responsibility to spring to instantiate this object
	@Autowired
	ProjectRepository proRep;
	
	@Autowired
	EmployeeRepository empRep;
	
	
	@GetMapping
	public String displayProjects(Model model) {
		List<Project> list = proRep.findAll();
		model.addAttribute("projects", list);
		return "project/list-projects";
	}

	@GetMapping("/new")
	public String displayProjectForm(Model model) {
		Project project = new Project();
		model.addAttribute("project", project);
		List<Employee> allEmployees = empRep.findAll();
		model.addAttribute("allEmployees",allEmployees);
		return "project/new-project";
	}
	
	@PostMapping("/save")
	public String createProject(Model model, Project project) {
		// this should handle saving to database...
		proRep.save(project);
			
		//use a redirect to prevent duplicate submissions
		return "redirect:/projects";
	}
}
