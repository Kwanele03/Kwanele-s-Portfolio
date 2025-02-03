package com.enviro.practice.grad001.kwanelentshele.projects;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
	@GetMapping("/projects")
	public String project(Model model) {
		return "projects";
	}
	

}
