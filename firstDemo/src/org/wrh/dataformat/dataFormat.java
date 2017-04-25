package org.wrh.dataformat;

import java.text.DateFormat;
import java.util.Date;

public class dataFormat {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.toString());
		DateFormat format1=DateFormat.getDateInstance();
		DateFormat format2=DateFormat.getDateTimeInstance(2,2);
		System.out.println(format1.format(date));//格式化日期输出为：2015-2-3 没有在高位补零
		System.out.println(format2.format(date));//格式化日期和时间
	}

}
