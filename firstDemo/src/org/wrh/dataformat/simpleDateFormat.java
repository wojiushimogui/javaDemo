package org.wrh.dataformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormat {

	public static void main(String[] args) throws ParseException {
		String str="2014-02-03 16:58:10.567";
		SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		SimpleDateFormat format2=new SimpleDateFormat("yyyy��MM��dd�� HHСʱmm����ss��SSS����");
		Date date=format1.parse(str);
		String date3=format1.format(date);
		String  date2=format2.format(date);
		System.out.println(date);
		//����ֱ��ͨ��DateFormat���еĸ�ʽת��������Ϊ��2014-2-3 16:58:10
		//System.out.println(DateFormat.getDateTimeInstance().format(date));
		System.out.println(date2);
		System.out.println(date3);
	}

}
