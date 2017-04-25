package org.wrh.regex;
//方法二：使用正则来验证字符串是否全是由数字组成
public class Regexdemo02 {

	public static void main(String[] args) {
		String str="1234567";
		if(str.matches("\\d+")){//检查字符串是否满足我们给出的正则表达式
			System.out.println("匹配成功");
		}
		else System.out.println("匹配失败");
	}

}
