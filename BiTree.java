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

	public void in(BiTree t) {
		java.util.Stack<BiTree> s = new java.util.Stack<BiTree>();
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

	public void post(BiTree t) {
		java.util.Stack<BiTree> s = new java.util.Stack<BiTree>();
		BiTree rnode = null;
		while (t != null || !s.isEmpty()) {
			while (t.left != null) {
				s.push(t);
				t = t.left;
			}
			while(t!=null&&t.right==null||t.right==rnode){
				System.out.println(t.data);
				rnode=t;
				if (s.isEmpty()){  
                    System.out.println();  
                    return;  
                } 
				t=s.pop();
			}
			s.push(t);
			t=t.right;
		}
	}
}
