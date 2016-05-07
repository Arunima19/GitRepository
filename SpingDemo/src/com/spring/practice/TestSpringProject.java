package com.spring.practice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringProject {

	public static void main(String[] args) {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("SpringConfig.xml");

		Restaurant res = (Restaurant) context.getBean("restaurant");

	      res.message();
	}
}
