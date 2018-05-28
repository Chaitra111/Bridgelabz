package com.bridgelabz.DataStructure;

public class StackLogic 
{
		private int maxSize;
		private long[] array;
		private int top;

		//for size  
		public StackLogic(int s)
		{
		maxSize = s;
		array = new long[maxSize];
		top = -1;
		}
		//Method to push elements  
		public void push(long j)
		{
		array[++top] = j;
		}
		//Method to retreive the elements(pop)   
		public long pop() 
		{
		return array[top--];
		}
		//Method to retreive the elements(peek) queue  
		public long peek() 
		{
		return array[top];
		}
		//Method to check whether stack is empty	   
		public boolean isEmpty()
		{
		return (top == -1);
		}
		//Method to check whether stack is full	   
		public boolean isFull()
		{
		return (top == maxSize - 1);
		}
	}