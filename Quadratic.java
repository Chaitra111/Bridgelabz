package com.bridgelabz.FunctioalPrograming;

import java.util.Scanner;

public class Quadratic
{
	public static void findRoots(double a,double b,double c)
	{
		double delta=((b*b)-(4*a*c));
		double r1=(-b+Math.sqrt(delta))/(2*a);
		double r2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("First root:" +r1);
		System.out.println("Second root:" +r2);
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer the x*x digit:");
		double a=sc.nextInt();
		System.out.println("Entrer the x digit:");
		double b=sc.nextInt();
		System.out.println("Entrer the last digit:");
		double c=sc.nextInt();
		findRoots(a,b,c);
	}
}