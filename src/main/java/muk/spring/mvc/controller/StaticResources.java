package muk.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticResources {

	@GetMapping("static/resource")
	public String getStaticPage() {
		return "static_resource";
	}
}
