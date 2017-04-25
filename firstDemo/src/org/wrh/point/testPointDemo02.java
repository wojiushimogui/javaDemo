package org.wrh.point;

public class testPointDemo02 {

	public static void main(String[] args) {
		pointdemo02<Integer> point1=new pointdemo02<Integer>(1,2);
		pointdemo02<Double> point2=new pointdemo02<Double>(1.8,2.6);
		pointdemo02<Object> point3=new pointdemo02<Object>(1.8,2.6);
		//pointdemo02<String> point4=new pointdemo02<String>("a","b");//设置泛型上限后String就不满足了
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		fun(point1);
		fun(point2);
		//fun(point3);
	}
	public static void fun(pointdemo02<? extends Number> p1){
		System.out.println(p1.getX());
		
	}
		
	

}
