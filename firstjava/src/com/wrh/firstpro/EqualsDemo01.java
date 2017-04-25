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
		 * 1、观察两个相等的Integer对象是否相等
		 * */
		System.out.println(i3==i4);//  true
		/*
		 * 2、观察经过“+”号自动拆箱后，“==”两边一边是Integer类型，一边是int类型
		 * */
		System.out.println(i3==(i1+i2));//  true
		//System.out.println(i5==i6);//不能编译，Integer类型和Long类型不能用“==”比较
		/*
		 *3、观察经过“+”号自动拆箱后，“==”两边，一边是Long类型，一边是int类型
		 * */
		System.out.println(i5==(i1+i3));//   true
		/*
		 *4、 观察equals两边都是同类型同值时是否相等。
		 * */
		System.out.println(i3.equals(i4));//  true
		//System.out.println((i1+i2).equals(i3));不能编译，经过“+”自动拆箱,equals左边是int类型，右边是Integer类型
		/*
		 * 经过“+”自动拆箱,equals左边是Integer类型，右边是int类型
		 * */
		System.out.println(i3.equals(i1+i2));//  true
		/*
		 * 观察(Integer).equals(Integer)
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
