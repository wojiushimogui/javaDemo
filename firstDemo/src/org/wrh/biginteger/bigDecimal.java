package org.wrh.biginteger;

import java.math.BigDecimal;

public class bigDecimal {

	public static void main(String[] args) {
		String str1="5";
		String str2="2";
		BigDecimal bigd1=new BigDecimal(str1);
		BigDecimal bigd2=new BigDecimal(str2);
		System.out.println(new BigDecimal("123.3456"));//���Ϊ123.3456
		System.out.println(new BigDecimal(123.3456));//���Ϊ��123.3456000000000045702108764089643955230712890625��123.��double���͵�ֵ����BigDecimal����ʱ��ֱ�ӶԴ˶��������������ܾ�ȷ�Ȳ���
		System.out.println(new BigDecimal(123.3456).doubleValue());//ת��Ϊdouble������������Ϊ123.456
		System.out.println("��Ϊ��"+bigd1.divide(bigd2,0,BigDecimal.ROUND_HALF_UP));//���Ϊ��3
		System.out.println("��Ϊ��"+bigd1.divide(bigd2,0,BigDecimal.ROUND_HALF_DOWN));//���Ϊ��2
		
	}

}
