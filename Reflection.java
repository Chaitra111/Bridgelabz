package com.bridgelabz.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {
		         
		        Test test = new Test();
		        
		        Method[] method = test.getClass().getMethods();
		        for (Method method2 : method) {
					System.out.println(method2.getName());
				}
		       method[0].invoke(test) ;
		    }
	}

