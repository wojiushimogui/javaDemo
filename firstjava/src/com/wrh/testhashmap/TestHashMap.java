package com.wrh.testhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class TestHashMap {
	
	public static void main(String[] args){
		Map<Integer,byte[]> hashMap = new HashMap<Integer,byte[]>();
		for(int i=0;i<100000;i++){
			hashMap.put(i, new byte[i]);
		}
	}
}
