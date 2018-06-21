package com.bridgelabz.AlgorithmPrograms;

import com.bridgelabz.Utility.Utility;

public class FindNumber 
{
	public static void find(int low,int up){
	    //Displaying the value
	    if(low==up){
	      System.out.println("Your number is : "+low);
	      System.out.println("Intermediary numbers is "+(low-1)+" and "+(low+1));
	      return;
	    }
	    //Finding middle value between range low and up
	    int mid=(low+up)/2;
	    int ch;
	    System.out.println("Press 1 : "+low+" - "+mid);
	    System.out.println("Press 2 : "+(mid+1)+" - "+up);
	    ch=new Utility().getInteger();
	    //Number is in first half
	    if(ch==1){
	      find(low,mid);
	    }
	    //Number is in second half
	    else{
	      find(mid+1,up);
	    }
		}
		public static void main(String args[]){
			System.out.println("Enter the Range  (N) :");
			int num=new Utility().getInteger();
			find(0,num-1);
		}
	}