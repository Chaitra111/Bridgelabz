package com.bridgelabz.DataStructure;

import java.util.NoSuchElementException;

 
public class QueueLogic<T> {
	int size;
	int front = -1;
	int rear = -1;
	int[] array;
	private T data;

	QueueLogic(int size) {
		this.size = size;
		array = new int[size];
	}

	public QueueLogic(T data) {
		this.data=data;
	}

	public QueueLogic() {
		this.front=-1;
		this.rear=-1;
	}

	public int enqueue(T data) {
		if (rear == size - 1) {
			System.out.println("Queue is full");
			return -1;
		}
		rear++;
		return array[rear] = (int) data;
	}

	public int dequeue() {
		if (front == size - 1) {
			System.out.println("Queue is empty");
			return -1;
		}
		front++;
		return array[front];
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	public int size() {
		return size;
	}
}