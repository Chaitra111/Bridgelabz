package com.bridgelabz.Utility;

public class UnorderedUtil
{ 
	private static Node head = null;
	private int size;
	static Node start= null;
		//creating node
	    class Node<E>
		{
		Object data;
		Node link;
		//constructor
		public Node(Object data) 
		{
		 this.data=data;
		}
		}
		
		//to add the elements in to list
		public void add(Object data)
		{
			Node current = new Node(data);
			if(head==null)
			{
				head=current;
				size++;
			}
		    Node t = head;
		    while(t.link!=null)
		    {
		    	t=t.link;
		    }
		    t.link=current;
		    size++;
		}
		//adding the elements at first
		public void addFirst(Object data)
		{
			Node first = new Node(data);
			first.link = head;
			head = first;
			size++;
		}
		//displaying elements
		public void display()
		{
			Node t = head;
			while(t!=null)
			{
				System.out.print(t.data+" ");
				t =t.link;
			}
			System.out.println();
		}
		//insert element at specified position
		public void insert(int index, Object data)
		{
			if(index ==0)
			{
				addFirst(data);
				return;
			}
			Node n1 = new Node(data);
			Node t = head;
			int count = 0;
			while(count <index -1)
			{
				t = t.link;
				count++;
			}
			n1.link = t.link;
			t.link = n1;
			size++;
		}
		//to reverse the list
		
		public int size()
		{
          System.out.println("the linked list size is"+size);
		return size;
		}
		//to check the list is empty or not
		public boolean isEmpty()
		{
		return head==null;
		}
		//to remove the element
		public Object remove(int index)
		{
			if(index == 0)
			{
				Object data = head.data;
				head = head.link;
				size--;
				return data;
			}
			int count = 0;
			Node t = head;
			while(count<index-1)
			{
				t = t.link;
				count++;
			}
			Object data = t.link.data;
			t.link = t.link.link;
			return data;
		}
		public boolean search(Node start, Object data)
		{
			while(start!=null)
			{
				if(start.data==data)
				{
				start=start.link;
				return true;
				}
				return search(start.link, data);
			}
			return false;
		}
		public void append(Object data)
		{
			Node current = new Node(data);
			while(head==null)
			{				
				head=new Node(data);
				return;
			}
			current.link=null;
			Node last=head;
			while(last.link!=null)
			{
				last=last.link;
				last.link=current;
				return;				
			}
			
		}
			
		public static void main(String[] args)
		{
		UnorderedUtil l=new UnorderedUtil();
		l.addFirst(10);
		//l.add(20);
		//l.display();
		l.add(30);
		//l.display();
		//l.insert(1,70);
		//l.display();
		//l.remove(2);
		//l.reverse();
		//l.add(90);
		l.addFirst(11);
		boolean res=l.search(head,12);
		System.out.println(res);
		//l.append(20);
		l.display();
		l.size();
		}
}

