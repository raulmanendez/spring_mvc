package muk.spring.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Formatter;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import muk.spring.mvc.formatter.AddressFormatter;

//To use this Configuration rename web.xml and set failOnMissingWebXml to false
//@Configuration
//@ComponentScan("muk.spring.mvc")
//@EnableWebMvc
public class WebApplicationContextConfig implements WebMvcConfigurer{
	
	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		view.setPrefix("/view/");
		return view;
	}
	
	//to support custom formatting of String to Objects See @AddressFormatter
	public void addFormatters(FormatterRegistry registry) {
		registry.addFormatter(new AddressFormatter());
	}

}
