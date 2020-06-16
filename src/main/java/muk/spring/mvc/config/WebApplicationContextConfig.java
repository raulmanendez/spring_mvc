package muk.spring.mvc.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import muk.spring.mvc.formatter.AddressFormatter;

//To use this Configuration rename web.xml and set failOnMissingWebXml to false
@Configuration
@ComponentScan("muk.spring.mvc")
@EnableWebMvc
public class WebApplicationContextConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		System.out.println("InternalResourceViewResolver Initiated");
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		view.setPrefix("/view/");
		return view;
	}
	
	//to support custom formatting of String to Objects See @AddressFormatter
	public void addFormatters(FormatterRegistry registry) {
		System.out.println("addFormatters Initiated");
		registry.addFormatter(new AddressFormatter());
	}
	
	
	 //<mvc:default-servlet-handler />
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("configureDefaultServletHandling Initiated");
		configurer.enable();
    }

    //mvc:resources mapping="/muk/**" location="/resources/"
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
    	System.out.println("addResourceHandlers Initiated");
        registry.addResourceHandler("/muk/**").addResourceLocations("/resources/");
    }
    
    @Bean
    public MessageSource messageSource() {
    	System.out.println("messageSource Initiated");
        ResourceBundleMessageSource resource = new ResourceBundleMessageSource();
        resource.setBasenames("customMessages", "errorMessages");
        return resource;
    }

    @Bean(name="validator")
    public LocalValidatorFactoryBean validator() {
    	System.out.println("LocalValidatorFactoryBean Initiated");
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource(messageSource());
        return bean;
    }

    public Validator getValidator() {
    	System.out.println("getValidator Initiated");
        return validator();
    }
}
