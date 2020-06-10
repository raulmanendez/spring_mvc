package muk.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import muk.spring.mvc.beans.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {

	@GetMapping("form")
	public String getForm(@ModelAttribute Student student) {
		return "student_form";
	}
	
	@PostMapping("form")
	public String saveForm(Student student) {
		System.out.println(student);
		return "student_form";
	}
	
	@ModelAttribute
	public void thismethodiscalledeverytimeinthiscontroller(Model model) {
		System.out.println("thismethodiscalledeverytimeinthiscontroller");
		model.addAttribute("defaultmethodcalled","Student Form");
	}
}
