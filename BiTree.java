package com.datastructure;

public class BiTree<T> {

	public void PreOrderTraverse(BiTreeNode<T> t) {
		java.util.Stack<BiTreeNode> s = new java.util.Stack<BiTreeNode>();
		s.push(t);
		while (!s.isEmpty()) {
			t = s.pop();
			System.out.println(t.data);
			if (t.right != null)
				s.push(t.right);
			if (t.left != null)
				s.push(t.left);

		}
	}

	public void InOrderTraverse(BiTreeNode<T> t) {
		java.util.Stack<BiTreeNode> s = new java.util.Stack<BiTreeNode>();
		while (t != null || !s.isEmpty()) {
			while (t != null) {
				s.push(t);
				t = t.left;
			}
			if (!s.isEmpty()) {
				t = s.pop();
				System.out.println(t.data);
				t = t.right;
			}

		}
	}

	public void PostOrderTraverse(BiTreeNode<T> t) {
		java.util.Stack<BiTreeNode> s = new java.util.Stack<BiTreeNode>();
		BiTreeNode<T> rnode = null;
		while (t != null || !s.isEmpty()) {
			while (t.left != null) {
				s.push(t);
				t = t.left;
			}
			while (t != null && t.right == null || t.right == rnode) {
				System.out.println(t.data);
				rnode = t;
				if (s.isEmpty()) {
					System.out.println();
					return;
				}
				t = s.pop();
			}
			s.push(t);
			t = t.right;
		}
	}
}

class BiTreeNode<T> {

	public BiTreeNode(T data) {
		this.data = data;
	}

	public BiTreeNode(T data, BiTreeNode<T> left, BiTreeNode<T> right) {
		this.left = left;
		this.right = right;
		this.data = data;
	}

	BiTreeNode<T> left;
	BiTreeNode<T> right;
	BiTreeNode<T> root;
	T data;
}
