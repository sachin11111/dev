package com.jrp.pma.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrp.pma.dao.EmployeeRepository;
import com.jrp.pma.dao.ProjectRepository;
import com.jrp.pma.dto.ChartData;
import com.jrp.pma.dto.EmployeeProject;
import com.jrp.pma.entities.Project;

@Controller
public class HomeController {

	
	// reading data from property file and showing it on page
	@Value("${version}")
	private String ver;
	
	@Autowired
	ProjectRepository proRep;
	
	@Autowired
	EmployeeRepository empRep;
	
	@GetMapping("/")
	public String displayHome(Model model) throws JsonProcessingException {
		
		//Map<String, Object> map = new HashMap<>();
		
		model.addAttribute("versionNumber", ver);
		
		// we are querying database for projects
		List<Project> projects = proRep.findAll();
		model.addAttribute("projects", projects);
		
		List<ChartData> projectData = proRep.getProjectStatus();
		
		// lets convert projectData into a json structure for use in javascript
		ObjectMapper mapper = new ObjectMapper();
		String jsonStr = mapper.writeValueAsString(projectData);
		
		// [["NOTSTARTED", 1], ["INPROGRESS", 2], ["COMPLETED", 1]] --- expected json
		model.addAttribute("projectStatusCnt", jsonStr);
		
		List<EmployeeProject> empList = empRep.employeeProjects();
		model.addAttribute("employees", empList);
		
		return "main/home";
	}
}
