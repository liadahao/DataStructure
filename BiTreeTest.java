package com.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiTreeTest {

	@Test
	public final void test() {
		BiTreeNode c = new BiTreeNode("a");
		BiTreeNode e = new BiTreeNode("b");
		BiTreeNode g = new BiTreeNode("c");
		BiTreeNode k = new BiTreeNode("e");
		BiTreeNode l = new BiTreeNode("f");
		BiTreeNode h = new BiTreeNode("d");
		BiTreeNode f = new BiTreeNode("-", g, h);
		BiTreeNode d = new BiTreeNode("*", e, f);
		BiTreeNode a = new BiTreeNode("+", c, d);
		BiTreeNode b = new BiTreeNode("/", k, l);
		BiTreeNode t = new BiTreeNode("-", a, b);
		BiTree z = new BiTree();
		z.InOrderTraverse(t);
	}

}
