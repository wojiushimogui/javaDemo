package com.wrh.testhashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class TestWeakHashMap5 {
	
	public static void main(String[] args){
		List<WeakHashMap<Integer[][], Integer[][]>> maps = new ArrayList<WeakHashMap<Integer[][],Integer[][]>>();	
		int totalNum = 10000;
		for(int i=0;i<totalNum;i++){
			WeakHashMap<Integer[][], Integer[][]> w = new WeakHashMap<Integer[][], Integer[][]>();
			w.put(new Integer[1000][1000], new Integer[1000][1000]);
			maps.add(w);
			for(int j=0;j<i;j++){
				System.out.println("��"+j+"��map�Ĵ�СΪ��"+maps.get(j).size());
			}
			
		}
	}
}

/*
 * ���н����Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 *	at com.wrh.testhashmap.TestWeakHashMap3.main(TestWeakHashMap3.java:15)
 * */
