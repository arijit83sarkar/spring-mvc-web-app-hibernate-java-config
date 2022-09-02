package com.raven.mvcwebapp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.core.env.Environment;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.raven.mvcwebapp")
public class ApplicationConfiguration {

	@Autowired
	private Environment environment;

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/WEB-INF/view/");
		resourceViewResolver.setSuffix(".jsp");

		return resourceViewResolver;
	}
}
