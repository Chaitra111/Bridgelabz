package com.spring.Scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Scope.xml");
	      PojoClass1 objA = (PojoClass1) context.getBean("helloWorld");

	      objA.setMessage("I'm object A"); //using protype scope 2objects are getting created 2nd one with null value,single ton create single object
	      objA.getMessage();

	      PojoClass1 objB = ( PojoClass1) context.getBean("helloWorld");
	      objB.getMessage();
	   }
	}