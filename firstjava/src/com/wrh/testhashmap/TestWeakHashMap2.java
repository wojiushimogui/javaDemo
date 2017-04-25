package com.wrh.testhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class TestWeakHashMap2 {
	
	public static void main(String[] args){
		Map<Integer,byte[]> weakHashMap = new WeakHashMap<Integer,byte[]>();
		for(int i=0;i<100000;i++){
			weakHashMap.put(i, new byte[i]);
		}	
		
	}
}
