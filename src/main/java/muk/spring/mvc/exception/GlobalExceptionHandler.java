package muk.spring.mvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(UserNotFound.class)
	public String userNotFound(Model model,UserNotFound e) {
		model.addAttribute("message",e.getMessage());
		return "error";
	}
	
	@ExceptionHandler(Exception.class)
	public String Exception(Model model,UserNotFound e) {
		model.addAttribute("message",e.getMessage());
		return "error";
	}
}
