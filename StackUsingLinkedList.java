package com.bridgelabz.DataStructure;

import java.util.NoSuchElementException;

import com.bridgelabz.Utility.Node1;

public class StackUsingLinkedList<T> {
		
		LinkedList link=new LinkedList();
		protected Node1 top;
		protected int size;

		/* Constructor */
		public StackUsingLinkedList() {
			top = null;
			size = 0;
		}

		public boolean isEmpty() {
			return top == null;
		}

		/* Function to get the size of the stack */
		public int getSize() {
			return size;
		}

		/* Function to push an element to the stack */
		public void push(T data) {
			Node1 nptr = new Node1(data, null);
			if (top == null)
				top = nptr;
			else {
				nptr.setLink(top);
				top = nptr;
			}
			size++;
		}

		/* Function to pop an element from the stack */
		public T pop() {
			if (isEmpty())
				throw new NoSuchElementException("Underflow Exception");
			Node1 ptr = top;
			top = ptr.getLink();
			size--;
			return (T) ptr.getData();
		}

		/* Function to check the top element of the stack */
		public int peek() {
			if (isEmpty())
				throw new NoSuchElementException("Underflow Exception");
			return (int) top.getData();
		}

		/* Function to display the status of the stack */
		public void display() {
			System.out.println("Stack = ");
			if (size == 0) {
				System.out.print("Empty");
				return;
			}
			Node1 ptr = top;
			while (ptr != null) {
				System.out.print(ptr.getData() + " ");
				ptr = ptr.getLink();
			}
			System.out.println();
		}
	}