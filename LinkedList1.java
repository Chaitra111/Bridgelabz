package com.bridgelabz.DataStructure;

public class LinkedList1<T extends Comparable<T>> {
	
	private Node<T> head = null;
	private int size = 0;

	public static class Node<T extends Comparable<T>> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}

		public T getValue() {
			return data;
		}

		public int compareTo(Object object) {
			return 0;
		}
	}

	public void add(T data) {
		Node<T> new_node = new Node<T>(data);
		if (head == null) {
			head = new_node;
			size++;
			return;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = (Node<T>) temp.next;

		}
		temp.next = new_node;
		new_node.next = null;
		size++;
	}

	public void addFirst(T data) {
		Node<T> new_node = new Node<T>(data);
		new_node.next = head;
		head = new_node;
		size++;
	}

	public void addLast(T data) {
		if (head == null) {
			addFirst(data);
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node<T>(data);
			size++;
		}
	}

	public void insertAfter(T data, T reference) {
		Node<T> temp = head;
		while (temp != null && !temp.data.equals(reference)) {
			temp = temp.next;
		}
	}

	public void display() {
		if (size == 0) {
			System.out.println("Empty");
			return;
		}
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public boolean search(T value) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.data.equals(value))
				return true;
			temp = temp.next;
		}
		return false;
	}

	public int getCount() {
		Node<T> temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public T removeAt(int index) {
		if (index == 0) {
			T temp = head.data;
			head = (Node<T>) head.next;
			size--;
			return temp;
		}
		Node<T> t = head;
		int count = 0;
		while (count < index - 1) {
			t = (Node<T>) t.next;
			count++;
		}
		T temp = t.next.data;
		t.next = t.next.next;
		size--;
		return temp;
	}

	public void remove(T data) {
		if (head == null) {
			System.out.println("Head cannot be null!!");
		}
		if (head.data.equals(data)) {
			head = head.next;
			return;
		}

		Node<T> cur = head;
		Node<T> prev = null;

		while (cur != null && !cur.data.equals(data)) {
			prev = cur;
			cur = cur.next;
		}

		if (cur == null) {
			System.out.println("cannot be null!!");
		}
		prev.next = cur.next;
	}

	public Object removeFirst() {
		Object temp = head.data;
		head = (Node<T>) head.next;
		size--;
		return temp;
	}

	public void displayMid() {
		Node<T> mid = head;
		int count = 0;
		while (count != size / 2) {
			mid = mid.next;
			count++;
		}
		System.out.println(mid.data);
	}

	public T getNth(int index) {
		Node<T> temp = head;
		int count = 0;

		while (count != index) {

			count++;
			temp = temp.next;
		}
		return temp.data;
	}

	public T pop() {
		T temp = head.data;
		head = head.next;
		size--;
		return temp;

	}

	public void addSorted(T data) {
		Node<T> current;
		Node<T> new_node = new Node<T>(data);
		if (head == null || head.data.compareTo(new_node.data) >= 0) {
			new_node.next = head;
			head = new_node;
		} else {
			current = head;
			while (current.next != null && current.next.data.compareTo(new_node.data) < 0) {
				current = current.next;
			}
			new_node.next = current.next;
			current.next = new_node;
		}
	}
}
