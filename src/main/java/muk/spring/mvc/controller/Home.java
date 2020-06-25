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

	@RequestMapping({"/","me"})
	public String getWelcome()
	{
		return "welcome";
	}
	
	@RequestMapping("/th")
	public String getWelcomeThymeleaf(Model model)
	{
		//return "welcome.html";
		
		 List<Product> products = Arrays.asList(
	                new Product(1L, "Mic", 129.00),
	                new Product(2L, "Tablet", 229.00),
	                new Product(3L, "Laptop", 329.00)
	        );
	        model.addAttribute("products", products);
	        return "product.html";
	}
	
	@ModelAttribute
	public void setProjectName(Model model)
	{
		model.addAttribute("projectName","Spring MVC Thymeleaf Page..");
	}
}
