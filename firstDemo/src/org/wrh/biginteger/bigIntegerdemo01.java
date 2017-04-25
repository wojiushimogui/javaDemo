package org.wrh.biginteger;

import java.math.BigInteger;

public class bigIntegerdemo01 {

	public static void main(String[] args) {
			String str1="9999999999999999999999";
			String str2="999999999999999999999";
			BigInteger big1=new BigInteger(str1);
			BigInteger big2=new BigInteger(str2);
			System.out.println(big1.add(big2));//Biginteger的加法运算
			System.out.println(big1.subtract(big2));//Biginteger的减法运算
			System.out.println(big1.multiply(big2));//Biginteger的乘法运算
			System.out.println(big1.divide(big2));//Biginteger的除法运算
			BigInteger[] results=big1.divideAndRemainder(big2);
			System.out.println("两个BigInteger数想除的商为："+results[0]);
			System.out.println("两个BigInteger数想除的余数为："+results[1]);

			

	}

}
