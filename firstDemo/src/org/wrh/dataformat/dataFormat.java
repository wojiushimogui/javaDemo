package org.wrh.dataformat;

import java.text.DateFormat;
import java.util.Date;

public class dataFormat {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		DateFormat format1=DateFormat.getDateInstance();
		DateFormat format2=DateFormat.getDateTimeInstance(2,2);
		System.out.println(format1.format(date));//��ʽ���������Ϊ��2015-2-3 û���ڸ�λ����
		System.out.println(format2.format(date));//��ʽ�����ں�ʱ��
	}

}
