package com.wrh.codeblock;

public class CommonCodeBlock {

	public static void main(String[] args) {
		//普通代码块的研究
		//普通代码块就是在方法或者是在语句中用{}定义的代码块
		//普通代码块和方法中其它语句的执行顺序与其出现的顺序一致：即先出现先执行。
		{
			System.out.println("方法中的普通代码块1");
		}
		
		System.out.println("主方法非代码块{}修饰的语句");
		{
			System.out.println("方法中的普通代码块2");			
		}
	}

}
/*
 * 运行结果如下：
方法中的普通代码块1
主方法非代码块{}修饰的语句
方法中的普通代码块2
 * */

