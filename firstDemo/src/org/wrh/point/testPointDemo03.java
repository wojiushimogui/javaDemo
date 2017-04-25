package org.wrh.point;

public class testPointDemo03 {

	public static void main(String[] args) {
		pointdemo03<Integer> point1=new pointdemo03<Integer>(1,2);
		pointdemo03<Double> point2=new pointdemo03<Double>(1.8,2.6);
		pointdemo03<Object> point3=new pointdemo03<Object>(1.8,2.6);
		pointdemo03<String> point4=new pointdemo03<String>("a","b");//设置泛型上限后String就不满足了
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		System.out.println(point4);
		fun(point1);
		fun(point2);
		//fun(point3);
	}
	public static void fun(pointdemo03<? extends Number> p1){
		System.out.println(p1.getX());
		
	}
		
	

}
