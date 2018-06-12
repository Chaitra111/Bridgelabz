package com.bridgelabz.DataStructure;
 

import com.bridgelabz.Utility.Node;

public class LinkedList<Integer> {
	Node head;
	int size;
	public String data1;
	public int data;
	public Node nextNode;
	
	//constructor
	public LinkedList()
	{
		this.nextNode=null;
	}
	public int size() {
		return size;
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
	 
	        
	        assert(false);
	        return 0;
	    }
	public void add(String string) {
		Node n1 = new Node(string);
		if (head == null) {
			head = n1;
			size++;
			return;
		}
		Node temp = head;
		while (temp.nextNode!= null)
			temp = (Node) temp.nextNode;
		temp.nextNode = n1;
		size++;
		return;
	}
	public void add(int data)
	{
		
		Node current = new Node();
		if(head==null)
		{
			head=current;
			size++;
		}
	    Node t = head;
	    while(t.nextNode!=null)
	    {
	    	t=t.nextNode;
	    }
	    t.nextNode=current;
	    size++;
	}
	public Object remove(int index)
	{
		if(index == 0)
		{
			Object data = head.data;
			head = head.nextNode;
			size--;
			return data;
		}
		int count = 0;
		Node t = head;
		while(count<index-1)
		{
			t = t.nextNode;
			count++;
		}
		Object data = t.nextNode.data;
		t.nextNode = t.nextNode.nextNode;
		return data;
	}
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println("data:->" + temp.data);
			temp = temp.nextNode;
		}
	}
	public int search(String data1) {
		if (head.data1.equals(data1)) {
			return 0;
		}
		Node temp = head;
		int count = 0;
		while (temp.nextNode != null) {
			temp = temp.nextNode;
			count++;
			if (temp.data1.equals(data1)) {
				System.out.println("word is present at : " + count);
				return count;
			}
		}
		return -1;
	}
	}

