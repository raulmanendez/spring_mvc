package muk.spring.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy=MatureAnnotation.class)
public @interface isMature {
	  String message() default "Immature Age is not acceptable !";
	  Class<?>[] groups() default {};
	  public abstract Class<? extends Payload>[] payload() default {};
}
