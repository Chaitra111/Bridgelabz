package com.addressbook.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :JSON annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface JSON 
{
	public String jsonName();
}