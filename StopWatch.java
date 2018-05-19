package com.bridgelabz.FunctioalPrograming;

import com.bridgelabz.Utility.Utility;

/**
 * @author Chaitra Ankolekar
 * Date : 18/05/2018
 * Purpose :  Calculate the time that elapsed time
 */
public class StopWatch 
{
	public long startTime=0;
	public long stopTime=0;
	public long elapsed;
	
	//to start timer
	public void start()
	{
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
	}
	
	// to stop timer
	public void stop()
	{
		stopTime=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTime);
	}
	
	public long getElapsedTime()
	{
		elapsed=stopTime-startTime;
		return elapsed;
	}
	
	public static void main(String[] args) throws Exception
	{
		StopWatch sw=new StopWatch();
		Utility u=new Utility();
		System.out.println("Press '1' to Start Time: ");
		u.getInteger();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		u.getInteger();
		sw.stop();

		long l=sw.getElapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+l);
		System.out.println();
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
	}
}