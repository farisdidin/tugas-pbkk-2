package com.didin.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.didin.di.Course;

@Configuration
public class JavaConfig {
	
	@Bean
	public Course studentCourse() {
		return new Course();
	}

}
