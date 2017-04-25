package com.wrh.sourceAna;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		List<Integer> tempList=new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(1);
		list.add(2);
		tempList.add(10);
		tempList.add(18);
		tempList.add(117);
		list.addAll(3, tempList);
		System.out.println(list);
	}

}
