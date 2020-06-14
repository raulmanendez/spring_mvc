package muk.spring.mvc.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("scope/")
@SessionAttributes({"session"})
public class AttributeScopes {

	@Autowired
	ServletContext context;
	
	@GetMapping("request")
	public String getrequestAttribute(Model model)
	{
		model.addAttribute("request","Mukesh Sharma in request Scope");
		return "attribute_scopes";
	}
	
	@GetMapping("session")
	public String getSessionAttribute(Model model)
	{
		model.addAttribute("session","Mukesh Sharma in session Scope");
		//return "redirect:go";//URL append go
		return "forward:go";//URL remains last called
	}
	
	@GetMapping("invalidatesession")
	public String InvalidateSession(Model model,SessionStatus status)
	{
		status.setComplete();
		//the session values will be lost after rendering means after refresh will be shown
		//return "redirect:go";//URL append go
		return "forward:go";//URL remains last called
	}
	
	@GetMapping("application")
	public String getApplicationAttribute(Model model)
	{
		context.setAttribute("application","Mukesh Sharma in Aplication Scope");
		//return "redirect:go";//URL append go
		return "forward:go";//URL remains last called
	}
	
	@GetMapping("go")
	public String renderAttribute(Model model)
	{
		return "attribute_scopes";
	}
}
