package com.wrh.testhashmap;

import java.lang.ref.WeakReference;

/*
 * ����һ��WeakReference�����ҽ���referent�ı�
 * */
public class TestReference2 {
	
	public static void main(String[] args) {
		Object o = new Object();
		WeakReference<Object> wr = new WeakReference<Object>(o);
		
		System.out.println(wr.get());//java.lang.Object@19e0bfd
		o = null;
		System.gc();
		System.out.println(wr.get());//null
	}

}
