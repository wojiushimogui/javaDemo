package com.wrh.firstpro;

public class EqualsDemo06 {

	public static void main(String[] args) {
		System.out.println(myCompare(new Integer(4),new Integer(4)));
	}
	public static int myCompare(Integer i1,Integer i2){
		
		return i1<i2?-1:((i1==i2)?0:1);
	}

}
