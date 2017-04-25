package org.wrh.point;

public class testPointDemo01 {

	public static void main(String[] args) {
		pointdemo01<Integer> point1=new pointdemo01<Integer>(1,2);
		pointdemo01<Double> point2=new pointdemo01<Double>(1.8,2.6);
		pointdemo01<String> point3=new pointdemo01<String>("a","b");
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		

	}

}
