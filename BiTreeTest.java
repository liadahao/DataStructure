package com.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BiTreeTest {

	@Test
	public final void test() {			
		BiTree c=new BiTree("a");
		BiTree d=new BiTree("b");
		BiTree a=new BiTree("*",c,d);
		BiTree b=new BiTree("c");
		BiTree t=new BiTree("-",a,b);
		t.pre(t);
	}

}
