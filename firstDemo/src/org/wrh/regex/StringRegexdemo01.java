package org.wrh.regex;

public class StringRegexdemo01 {

	public static void main(String[] args) {
		//使用String类中的正则来进行一个邮箱的验证
		String str="134567889r@qqe.net";
		//String pat="\\w+@\\w+.\\w+";//没有考虑现实情况下使用的一个正则
		//如考虑现实我们用的邮箱的一个情况：我们的邮箱后缀有：com、com.cn、edu、gov、net、net.cn等等
		//因此我们使用的正则如下：
		String pat="\\w+@\\w+.(com|com.cn|edu|gov|net|net.cn)";
		if(str.matches(pat))
			System.out.println("matcher success");
		else 
			System.out.println("matcher failure");
		
	}

}
