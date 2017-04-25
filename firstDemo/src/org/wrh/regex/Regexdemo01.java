//验证字符串是否全是由数字组成
//方法一：不使用正则
package org.wrh.regex;

public class Regexdemo01 {

	public static void main(String[] args) {
		String str="123as566";
		boolean flag=true;
		char[] c=str.toCharArray();//将字符串转为字符数组
		for(int i=0;i<c.length;i++)
			if(!(c[i]>='0'&&c[i]<='9'))
			{
				flag=false;
				break;
			}
		if(flag){
			System.out.println("匹配成功");
		}
		else System.out.println("匹配失败");
	}

}
