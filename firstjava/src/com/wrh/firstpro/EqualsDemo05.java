package com.wrh.firstpro;

public class EqualsDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i6=5;
		Long    i5=4L;
		//System.out.println(i5==i6);//不能编译，Integer类型和Long类型不能用“==”比较
		System.out.println(i6.equals(i5+1));
	}

}
