package muk.spring.mvc.thymeleaf;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import muk.spring.mvc.beans.Product;
import muk.spring.mvc.beans.User;
import muk.spring.mvc.beans.UserAddress;

@Controller
@RequestMapping("/thymeleaf/")
public class ThymeleafView {

	@GetMapping("simple_expression")
	public String getSimpleExpression(Model model)
	{
		List<Product> products = Arrays.asList(new Product(1L, "Mic", 129.00), new Product(2L, "Tablet", 229.00),
				new Product(3L, "Laptop", 329.00));
		model.addAttribute("products", products);
		
		
		UserAddress address=new UserAddress();
		address.setState("HP");
		address.setStreet("Sirmour");
		address.setZipcode(173024);
		
		User user=new User();
		user.setAddr(address);
		user.setAge(22);
		user.setBirthday(LocalDate.of(1998, 01, 30));
		user.setEmail("muk214782@gmail.com");
		user.setName("Mukesh Sharma");
		user.setRole("Developer");
		
		model.addAttribute("user", user);
		
		return "simple_expression.html";
	}
	
	@GetMapping("conditional_expression")
	public String getConditionalExpression(Model model)
	{
		model.addAttribute("user", new User());
		
		return "conditional_expression.html";
	}
	
	@GetMapping("iteration_expression")
	public String getIterationExpression(Model model)
	{
		List<Product> products = Arrays.asList(new Product(100L, "Mic", 129.00), new Product(200L, "Tablet", 229.00),
				new Product(300L, "Laptop", 329.00));
		model.addAttribute("products", products);
		
		return "iteration_expression.html";
	}
}
