package org.wrh.biginteger;

import java.math.BigInteger;

public class bigIntegerdemo01 {

	public static void main(String[] args) {
			String str1="9999999999999999999999";
			String str2="999999999999999999999";
			BigInteger big1=new BigInteger(str1);
			BigInteger big2=new BigInteger(str2);
			System.out.println(big1.add(big2));//Biginteger�ļӷ�����
			System.out.println(big1.subtract(big2));//Biginteger�ļ�������
			System.out.println(big1.multiply(big2));//Biginteger�ĳ˷�����
			System.out.println(big1.divide(big2));//Biginteger�ĳ�������
			BigInteger[] results=big1.divideAndRemainder(big2);
			System.out.println("����BigInteger���������Ϊ��"+results[0]);
			System.out.println("����BigInteger�����������Ϊ��"+results[1]);

			

	}

}
