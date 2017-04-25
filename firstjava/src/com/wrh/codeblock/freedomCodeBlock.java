package com.wrh.codeblock;
//自由代码块的研究
//自由代码块就是在类中用{}定义的代码块
//执行顺序在new对象调用构造方法之前执行。但如果在一个类中有几个自由代码块，则其执行顺序与其出现的顺序一致：即先出现先执行。
//且每新建一个对象，都会执行一次。
public class freedomCodeBlock {
	{
		System.out.println("自由代码块2被运行");//故意将2写在前面
	}
	public freedomCodeBlock(){
		System.out.println("构造函数被执行");
	}
	{
		System.out.println("自由代码块1被执行");
	}
	public static void main(String[] args) {
		System.out.println("main 方法中在创建对象前的第一条语句被执行");
		new freedomCodeBlock();
		new freedomCodeBlock();
	}

}
/*
 * 运行结果如下
main 方法中在创建对象前的第一条语句被执行
自由代码块2被运行
自由代码块1被执行
构造函数被执行
自由代码块2被运行
自由代码块1被执行
构造函数被执行
 * */

