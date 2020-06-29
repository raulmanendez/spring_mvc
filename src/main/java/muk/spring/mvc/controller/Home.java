package muk.spring.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import muk.spring.mvc.beans.Product;

@Controller
public class Home {

	@RequestMapping({"/","jsp"})
	public String getWelcome()
	{
		return "welcome";
	}
	
	@RequestMapping("/thymeleaf")
	public String getWelcomeThymeleaf(Model model)
	{
		return "welcome.html";
	}
	
	@ModelAttribute
	public void setProjectName(Model model)
	{
		model.addAttribute("projectName","Spring Thymeleaf");
	}
}
