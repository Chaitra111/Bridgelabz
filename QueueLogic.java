package com.bridgelabz.DataStructure;

public class QueueLogic 
{
	int array[];
	int size;
	int front=0;
	int rear=-1;
	int n=0;
	
	public QueueLogic(int capacity)
	{
		size=capacity;
		array=new int[size];
	}
	
	//add items to the rear end of the queue
	public void enqueue(int item)
	{
		if(queueFull())
		{
			System.out.println("Overflow! cannot add the elements");
		}
		else
		{
			rear++;
			if(rear==size-1)
			{
				rear=0;
			}
			array[rear]=item;
			n++;
			System.out.println("Element at " +item+" is pushed to the queue");
		}
	}
	
	//to remove the elements from queue
	public void dqueue()
	{
		if(queueEmpty())
		{
			System.out.println("Elements cannot be added to the queue");
		}
		else
		{
			front++;
			if(front==size-1){
				System.out.println("pop operation done:" +array[front-1]);
				front=0;
			}
			else {
				System.out.println("pop operation done:" +array[front-1]);
			}
			n--;
		}
	}
	public boolean queueEmpty()
	{
		return (n==0);	
	}
	public boolean queueFull()
	{
		return (n==rear);
	}
	public int qsize()
	{
		return n;
	}
	public void display()
	{
		int start = front;
	    for (int j = front ;j <size; j++ )
		  {  
		      System.out.println(array[j]);
		     if (j ==n-1 )
		        {     
		    	  j=0;
		          System.out.println(array[j]);
		        } 
		      if (j==start-1)
		          return;
	      }
	}   
	public static void main(String[] args)
	{
		QueueLogic q=new QueueLogic(8);
		q.enqueue(12);
		q.enqueue(14);
		q.enqueue(9);
		q.enqueue(4);
		q.dqueue();
		int a=q.qsize();
		System.out.println("size:"+a);
		q.dqueue();
		q.dqueue();
		//q.enqueue(19);
		int a1=q.qsize();
		System.out.println("size"+a1);
		q.display();
		//int a1=q.qsize();
		//System.out.println("size"+a1);
		boolean res=q.queueEmpty();
		System.out.println(res);
		boolean res1=q.queueFull();
		System.out.println(res1);
	}
}
