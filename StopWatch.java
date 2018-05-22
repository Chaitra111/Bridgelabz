package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :  Calculate the time that elapsed time
 */
public class StopWatch 
{
	public static void main(String[] args) throws Exception
	{
		//StopWatch sw=new StopWatch();
		Utility u=new Utility();
		System.out.println("Press '1' to Start Time: ");
		u.getInteger();
		u.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		u.getInteger();
		u.stop();

		long l=u.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}