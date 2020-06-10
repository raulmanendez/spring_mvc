package muk.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping can be placed here also but URL will prefix its value
public class RequestCheck {

	//@RequestMapping(value="/form",method=RequestMethod.GET)
	//The above is equals to the below thing
	@GetMapping("/form")
	public String getForm() {
		return "form_data";
	}
	
	//@RequestMapping(value="/form",method=RequestMethod.POST)
	//The above is equals to the below thing
	@PostMapping("/form")
	public String saveForm() {
		System.out.println("Form Data Posted...");
		return "form_data";
	}
	
	@GetMapping("/formParam")
	public String getFormParam(@RequestParam String name) {//variable name is same as param name
		System.out.println("getFormPathVariable Name is::"+name);
		return "form_data";
	}
	
	@GetMapping("/formPathVariable/name/{name}")
	public String getFormPathVariable(@PathVariable String name) {
		System.out.println("getFormPathVariable Name is::"+name);
		return "form_data";
	}
}
