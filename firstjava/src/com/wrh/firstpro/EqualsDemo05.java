package com.wrh.firstpro;

public class EqualsDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i6=5;
		Long    i5=4L;
		//System.out.println(i5==i6);//���ܱ��룬Integer���ͺ�Long���Ͳ����á�==���Ƚ�
		System.out.println(i6.equals(i5+1));
	}

}
