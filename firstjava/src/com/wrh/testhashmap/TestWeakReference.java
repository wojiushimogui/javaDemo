package com.wrh.testhashmap;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class TestWeakReference {
	private static ReferenceQueue<Object> rq = new ReferenceQueue<Object>();
	public static void main(String[] args) {
		Object obj = new Object();
		WeakReference<Object> wr = new WeakReference(obj,rq);
		System.out.println(wr.get()!=null);
		obj = null;
		System.gc();
		System.out.println(wr.get()!=null);//false，这是因为WeakReference被回收
	}

}
