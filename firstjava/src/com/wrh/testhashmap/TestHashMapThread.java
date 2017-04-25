package com.wrh.testhashmap;

import java.util.HashMap;

public class TestHashMapThread {

	public static void main(String[] args) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(2);
		map.put(3, 3);
		new Thread("Thread1"){

			@Override
			public void run() {
				map.put(7, 7);
				System.out.println(map);
			}
			
		}.start();;
		new Thread("Thread2"){

			@Override
			public void run() {
				map.put(5, 5);
				System.out.println(map);
			}
			
		}.start();
	}

}
