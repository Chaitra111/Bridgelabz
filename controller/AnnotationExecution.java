package com.addressbook.controller;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :Addressbook excution using annotations
 */

public class AnnotationExecution {
	
	static String res;
	static String res1;

	@JSON(jsonName = "json")
	public static String jsonMethod() throws NoSuchMethodException, SecurityException {
		final Method method = AnnotationExecution.class.getMethod("jsonMethod");
		if (method.isAnnotationPresent(JSON.class)) {
			final Annotation annotation = method.getAnnotation(JSON.class);
			final JSON name = (JSON) annotation;
			System.out.println(name.jsonName());
			res = name.jsonName();
		}
		return res;
	}
	
	@JDBC(jdbcName = "jdbc")
	public static String jdbcMethod() throws NoSuchMethodException, SecurityException {
		final Method method = AnnotationExecution.class.getMethod("jdbcMethod");
		if (method.isAnnotationPresent(JSON.class)) {
			final Annotation annotation = method.getAnnotation(JSON.class);
			final JDBC name = (JDBC) annotation;
			System.out.println(name.jdbcName());
			res1 = name.jdbcName();
		}
		return res1;
	}
}
