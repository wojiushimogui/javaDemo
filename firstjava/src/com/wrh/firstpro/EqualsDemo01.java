package com.wrh.firstpro;

public class EqualsDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1=1;
		Integer i2=2;
		Integer i3=3;
		Integer i4=3;
		Integer i6=4;
		Long    i5=4L;
		/*
		 * 1���۲�������ȵ�Integer�����Ƿ����
		 * */
		System.out.println(i3==i4);//  true
		/*
		 * 2���۲쾭����+�����Զ�����󣬡�==������һ����Integer���ͣ�һ����int����
		 * */
		System.out.println(i3==(i1+i2));//  true
		//System.out.println(i5==i6);//���ܱ��룬Integer���ͺ�Long���Ͳ����á�==���Ƚ�
		/*
		 *3���۲쾭����+�����Զ�����󣬡�==�����ߣ�һ����Long���ͣ�һ����int����
		 * */
		System.out.println(i5==(i1+i3));//   true
		/*
		 *4�� �۲�equals���߶���ͬ����ֵͬʱ�Ƿ���ȡ�
		 * */
		System.out.println(i3.equals(i4));//  true
		//System.out.println((i1+i2).equals(i3));���ܱ��룬������+���Զ�����,equals�����int���ͣ��ұ���Integer����
		/*
		 * ������+���Զ�����,equals�����Integer���ͣ��ұ���int����
		 * */
		System.out.println(i3.equals(i1+i2));//  true
		/*
		 * �۲�(Integer).equals(Integer)
		 * */
		System.out.println(i6.equals(i5));//   true
		
		Integer i7=new Integer(4);
		Integer i8=new Integer(4);
		int i9=4;
		System.out.println(i7==i8);
		System.out.println(i7==i6);
		System.out.println(i7==i9);
		System.out.println(i7.equals(i8));
		System.out.println(i7.equals(i9));
		System.out.println(myCompare(i7,i8));
	}
	public static int myCompare(Integer i1,Integer i2){
		
		return i1<i2?-1:((i1==i2)?0:1);
	}

}
