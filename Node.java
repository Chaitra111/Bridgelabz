package com.bridgelabz.Utility;
//linkedlist node
public class Node
{
	Node head;
	public String data1;
	public int data;
	public Node nextNode;
	
	//constructor
	public Node()
	{
		this.nextNode=null;
	}

	public Node(String data1) {
		this.data1=data1;
	}

	public void setData(String data1)
	{
		this.data1=data1;
		nextNode=null;
	}
	
	public void setData(int data)
	{
		this.data=data;
		nextNode=null;
	}
	public int getCount()
    {
		Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.nextNode;
        }
        return count;
    }
	public int getNth(int index)
	 {
	        Node current = head;
	        int count = 0; /* index of Node we are
	                          currently looking at */
	        while (current != null)
	        {
	            if (count == index)
	                return current.data;
	            count++;
	            current = current.nextNode;
	        }
	 
	        /* if we get to this line, the caller was asking
	        for a non-existent element so we assert fail */
	        assert(false);
	        return 0;
	    }
	 
}
