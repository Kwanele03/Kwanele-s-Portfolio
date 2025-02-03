package com.enviro.practice.grad001.kwanelentshele.skills;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SkillsController {
	@GetMapping("/skills")
	public String skill(Model model) {
		return "skills";
	}

}
