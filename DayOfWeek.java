package com.bridgelabz.AlgorithmPrograms;

public class DayOfWeek
{
	public static void daysOfWeek(int day,int month,int year)
	{
		String [] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		//String [] string = {"Janaury","Febrauary","March","April","May","June","July","August","September","October","November","December"};
		 	int y = year - (14 - month) / 12;
	        int x = y + y/4 - y/100 + y/400;
	        int m = month + 12 * ((14 - month) / 12) - 2;
	        int d = (day + x + (31*m)/12) % 7;
	        System.out.println(days[d]);
	}
	public static void main(String[] args)
	{
		for(int i=0; i<args.length; i++)
		{
			System.out.println(args[i]);
		}
		daysOfWeek(Integer.parseInt(args[0]), Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	}

}
