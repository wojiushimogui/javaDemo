package com.wrh.testhashmap;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;

public class TestReference3 {
	private static ReferenceQueue<Object> rq = new ReferenceQueue<Object>();
	public static void main(String[] args){
		Object obj = new Object();
		SoftReference<Object> sf = new SoftReference(obj,rq);
		System.out.println(sf.get()!=null);
		System.gc();
		obj = null;
		System.out.println(sf.get()!=null);
		
	}
}
