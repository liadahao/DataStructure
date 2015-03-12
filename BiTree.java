package com.datastructure;

public class BiTree<T> {

	private BiTree left;
	private BiTree right;
	private BiTree root;
	private T data;

	public BiTree(Object data, BiTree left, BiTree right) {
		this.data = (T) data;
		this.left = left;
		this.right = right;
	}

	public BiTree(T data) {
		this.data = data;
	}

	public void pre(BiTree t) {
		java.util.Stack<BiTree> s = new java.util.Stack<BiTree>();
		while (t.right != null) {
			s.push(t.right);
			s.push(t);
			t = t.left;
		}
		while (!s.isEmpty()) {
			System.out.println(t.data);
			t = s.pop();
		}
		System.out.println(t.data);
	}
}
