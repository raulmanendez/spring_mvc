package muk.spring.mvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import muk.spring.mvc.beans.Product;

@Controller
@RequestMapping("/pro/")
public class ProductController {
	@GetMapping("list")
	public String getProductList(Model model) {
		List<Product> products = Arrays.asList(new Product(1L, "Mic", 129.00), new Product(2L, "Tablet", 229.00),
				new Product(3L, "Laptop", 329.00));
		model.addAttribute("products", products);
		return "product";
	}
}
