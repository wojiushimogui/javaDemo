package com.wrh.testhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class TestWeakHashMap {
	
	public static void main(String[] args){
		Map<Integer,byte[]> weakHashMap = new WeakHashMap<Integer,byte[]>();
		for(int i=0;i<100000;i++){
			weakHashMap.put(i, new byte[i]);
		}
		
		byte[] b = weakHashMap.get(2);
		if(b==null){
			System.out.println("null");
		}
		else{
			System.out.println(b);
		}
		
	}
}
