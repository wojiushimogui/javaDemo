package org.wrh.biginteger;

import java.math.BigDecimal;

public class bigDecimal {

	public static void main(String[] args) {
		String str1="5";
		String str2="2";
		BigDecimal bigd1=new BigDecimal(str1);
		BigDecimal bigd2=new BigDecimal(str2);
		System.out.println(new BigDecimal("123.3456"));//输出为123.3456
		System.out.println(new BigDecimal(123.3456));//输出为：123.3456000000000045702108764089643955230712890625，123.用double类型的值构造BigDecimal对象时，直接对此对象进行输出，可能精确度不高
		System.out.println(new BigDecimal(123.3456).doubleValue());//转换为double类型输出，输出为123.456
		System.out.println("商为："+bigd1.divide(bigd2,0,BigDecimal.ROUND_HALF_UP));//输出为：3
		System.out.println("商为："+bigd1.divide(bigd2,0,BigDecimal.ROUND_HALF_DOWN));//输出为：2
		
	}

}
