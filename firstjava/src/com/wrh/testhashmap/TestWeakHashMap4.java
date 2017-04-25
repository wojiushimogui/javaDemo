package com.wrh.testhashmap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class TestWeakHashMap4 {
	
	public static void main(String[] args){
		List<WeakHashMap<Integer[][], Object>> maps = new ArrayList<WeakHashMap<Integer[][],Object>>();	
		int totalNum = 10000;
		for(int i=0;i<totalNum;i++){
			WeakHashMap<Integer[][], Object> w = new WeakHashMap<Integer[][], Object>();
			w.put(new Integer[1000][1000], new Object());
			maps.add(w);
			System.gc();
			System.out.println(i);
		}
	}
}

/*
 * 运行结果：正常
 *	
 * */
