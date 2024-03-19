package com.doranco.coursSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class CoursSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursSpringApplication.class, args);
	}
}

@Controller
class HomeController {
	@GetMapping("/home/{title}")
	public String home(@PathVariable String title, Model model){
		model.addAttribute("title", title);
		return "index";
	}
}