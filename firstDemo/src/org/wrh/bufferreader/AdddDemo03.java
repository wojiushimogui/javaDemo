package org.wrh.bufferreader;

import java.util.Date;

import org.wrh.menudemo.InputData;

//两个数相加的第二个版本，当我们输入的不是数字时，我们程序能给与提示
//用正则表达式来完成验证

public class AdddDemo03 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//用来接收的两个数
		InputData input=new InputData();
		i=input.getInt("请输入数据：", "输入数据必须是整数！！！  ");
		j=input.getInt("请输入数据：", "输入数据必须是整数！！！  ");
		System.out.println("两个数的结果如下："+i+"+"+j+"="+(i+j));
		
		float m=0;
		float n=0;//用来接收的两个数
		m=input.getFloat("请输入数据：", "输入数据必须是float型！！！  ");
		n=input.getFloat("请输入数据：", "输入数据必须是float型！！！  ");
		System.out.println("两个数的结果如下："+m+"+"+m+"="+(m+n));
		
		///Date date1=input.getData("请输入日期数据，", "输入的必须是日期数据");
		//Date date2=input.getData("请输入日期数据，", "输入的必须是日期数据");
		//System.out.println("两个数的结果如下："+date1+"+"+date2+"="+(date1+date2));
		
		
	}

}
