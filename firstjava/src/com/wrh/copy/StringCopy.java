package com.wrh.copy;
//先看下String类型的拷贝，到底是浅拷贝还是深拷贝
public class StringCopy {
	public static void main(String [] args){
		String str1="wuanghao";
		//String str2=str1.clone();
		String str2=str1;
		str2=str2+"wo";
		System.out.println(str1);
	}
}
