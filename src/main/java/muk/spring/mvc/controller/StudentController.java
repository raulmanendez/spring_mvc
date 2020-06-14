package muk.spring.mvc.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import muk.spring.mvc.beans.State;
import muk.spring.mvc.beans.Student;

@Controller
@RequestMapping("/student/")
public class StudentController {

	@GetMapping("form")
	public String getForm(Student student) {
		return "student_form";
	}
	
	@GetMapping("form_spring")
	public String getFormSpring(Student student,Model model) {
		/*//1. Use List<String> as select
		List<String> state_list=Arrays.asList("Himachal","Punjab","Haryana");
		model.addAttribute("state_list",state_list);*/	
		
		
		/*//2. Use Map<String, String> as select
		Map<String, String> state_map=new HashMap<String, String>();
		state_list.put("HP", "Himachal");
		state_list.put("PUN", "Punjab");
		state_list.put("HR", "Harayana");
		model.addAttribute("state_map",state_map);*/
		
		//3. Use List<State> as select
		List<State> state_obj_list=Arrays.asList
		(
		new State("HP", "Himachal"),
		new State("PUN", "Punjab"),
		new State("HR", "Harayana")
		);
		model.addAttribute("state_obj_list",state_obj_list);
		
		
		return "student_spring_form";
		
		
	}
	
	@PostMapping({"form_spring"})
	public String saveFormSpring(Student student,Model model) {
		System.out.println(student);
		return getFormSpring(student, model);
	}
	
	
	@PostMapping({"form"})
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
