package com.enviro.practice.grad001.kwanelentshele.about;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
	@GetMapping("/about")
	public String home() {
		return "about";
	}
}
