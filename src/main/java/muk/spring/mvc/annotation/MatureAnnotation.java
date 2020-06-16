package muk.spring.mvc.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MatureAnnotation implements ConstraintValidator<isMature, Integer>{

	public void initialize(isMature arg0) {
		System.out.println("MatureAnnotation.initialize called...");
	}

	public boolean isValid(Integer arg0, ConstraintValidatorContext arg1) {
		if(arg0!=null)
		if(arg0>=18)
			return true;
		return false;
	}

}
