package com.wrh.someAlgrithomProgram;

public class Node {
	public static void main(String[]args){
		byte b=120;
		b+=20;
		//System.out.println(b+20);//自动提升为int型，因此结果为140
		System.out.println(b);//结果为-116,原因在于（140）=（10001100）,byte为8bit，且最高位为符号位，因此140超过了byte类型的表示范围，
		//因此，最终的结果机器将理解为一个带符号数，将（10001100）作为反码来理解，求反之后的结果为 -116
		
		
	}
}
