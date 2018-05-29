package com.bridgelabz.DataStructure;

import com.bridgelabz.Utility.Utility;

public class Calender {
	 		
	//Function to match the given month and return its maximum days
    static int findMaxDay(String mname, int y)
    {
		String months[] = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int D[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0))) {
			D[2] = 29;
		}
		int max = 0;
		for (int i = 1; i <= 12; i++) {
			if (mname.equalsIgnoreCase(months[i])) {
				max = D[i]; // Saving maximum day of given month
			}
		}
		return max;
    }
     
    //Function to match the given weekday name and return its weekday no.
    /*static int findDayNo(String wname)
    {
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", 
                            "Saturday"};
        int f = 0;
        for(int i=0; i<7; i++)
        {
            if(wname.equalsIgnoreCase(days[i]))
            {
                f = i;  //Saving week day no. given day (e.g. '0' for Sunday)
            }
        }
        return f;
    }*/
     
    //Function for creating the calendar
    static void fillCalendar(int max, int f, String mname, int y)
    {
		int A[][] = new int[6][7];
		int x = 1, z = f;

		for (int i = 0; i < 6; i++) {
			for (int j = f; j < 7; j++) {
				if (x <= max) {
					A[i][j] = x;
					x++;
				}
			}
			f = 0;
		}
		for (int j = 0; j < z; j++) // Adjustment to bring last (6th) row elements to first row
		{
			A[0][j] = A[5][j];
		}

		printCalendar(A, mname, y); // Calling function to print the calendar
    }
     
    //Function for printing the calendar
    static void printCalendar(int A[][], String mname, int y)
    {  
		System.out.println("\n\t****************JAVA CALENDER**********************");
		System.out.println("\t\t\t " + mname + " " + y);
		System.out.println("\t----------------------------------------------------");
		System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
		System.out.println("\t----------------------------------------------------");

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				if (A[i][j] != 0)
					System.out.print("\t " + A[i][j]);
				else
					System.out.print("\t ");
			}
			System.out.println("\n\t");// ----------------------------------------------------");
		}
    }
     
    public static void main(String args[])
    {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int max = findMaxDay(args[0], Integer.parseInt(args[1]));
		// int f = findDayNo(args[2]);
		fillCalendar(max, 7, args[0], Integer.parseInt(args[1]));
	}
}