package com.didin.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainAppController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "main-form";
	}
}
