package com.datastructure;

public class Stack<T> {

	class Node {

		private T data;
		private Node pre;

		public Node(T t, Node top) {
			this.data = t;
			this.pre = top;
		}
	}

	private Node top;
	private int size;

	public Stack() {
		top = null;
		size = 0;
	}

	public Stack(int n) {
		top = null;
		size = n;
	}

	public void push(T t) {
		top = new Node(t, top);
		size++;
	}

	public T pop() {
		if (size > 0) {
			Node node = top;
			top = top.pre;
			node.pre = null;
			size--;
			return node.data;
		} else {
			return null;
		}
	}

	public T peek() {
		return top.data;
	}

	public int length() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}
}
