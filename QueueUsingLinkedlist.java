package com.bridgelabz.DataStructure;
import java.util.NoSuchElementException;

import com.bridgelabz.Utility.Node1;

public class QueueUsingLinkedlist<T> {
	protected Node1 front, rear;
	public int size;

	public QueueUsingLinkedlist() {
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() {
		return front == null;
	}

	/* Function to get the size of the queue */
	public int getSize() {
		return size;
	}

	/* Function to insert an element to the queue */
	
	public void insert(T data) {
		Node1 nptr = new Node1(data, null);
		if (rear == null) {
			front = nptr;
			rear = nptr;
		} else {
			rear.setLink(nptr);
			rear = rear.getLink();
		}
		size++;
	}

	/* Function to remove front element from the queue */
	
	public int remove() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node1 ptr = front;
		front = ptr.getLink();
		if (front == null)
			rear = null;
		size--;
		return (int) ptr.getData();
	}

	/* Function to check the front element of the queue */
	
	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return (int) front.getData();
	}

	/* Function to display the status of the queue */
	
	public void display() {

		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node1 ptr = front;
		while (ptr != rear.getLink()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
	}
}