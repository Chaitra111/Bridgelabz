package com.bridgelabz.DataStructure;

import java.util.Arrays;

import com.bridgelabz.Utility.Utility;
public class PrimeArray
{    
    
    static int A[][]=new int[1000][1000];
    
    public static boolean anag(String s1,String s2)
    {    
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);//sort string1
        Arrays.sort(ch2);//sort string2
        boolean res=Arrays.equals(ch1,ch2);
        if(res)
        {
            return true;
        }
        else
        return false;
    }
    
    static boolean isPrime(int n)
    {
        int c = 0;
        for (int i = 1; i <= n; i++)
        {
             if (n % i == 0)
             c++;
         }
         if (c == 2)
         return true;
         else
         return false;
    }
    
    public static void main(String[] args)
    {  int a=100,i=0,j=0,k=0;
        Utility u=new Utility();
        for( i=0;i<=18;i++)
        {   
            for( j=k;j<a;j++)
            {
                if(isPrime(j))
                {
                    A[i][j]=j;
                
                    System.out.print(" "+A[i][j]);
                }    
            }
            System.out.println();
            
            a+=100;k+=100;
            i=i+1;        
        }
       
     }
}


   