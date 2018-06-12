package com.bridgelabz.DataStructure;

public class StackLogic<T> {
	int top;
	int size;
	int[] array;

	public StackLogic(int size) {
		top = -1;
		this.size = size;
		array = new int[size];
	}

	public int push(T i) {
		if (top == size - 1) {
			System.out.println("Stack Overflow");
			return (int) i;
		}
		return array[++top] = (int) i;
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		return array[top--];
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack empty");
			return -1;
		}
		return array[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int size() {
		return size;
	}

	public void display() {
		for (int i = 0; i <= top; i++) {
			System.out.println(array[i]);

		}
	}
}