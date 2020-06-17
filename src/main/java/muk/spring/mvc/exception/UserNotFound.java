package muk.spring.mvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="There is some glitch in the system ! We will fix it soon.")
public class UserNotFound extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	String message;

	
	  public UserNotFound(String message) {
	        this.message = message;
	    }
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
