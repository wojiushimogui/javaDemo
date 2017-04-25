package com.wrh.codeblock;
//静态代码块的研究
//静态代码块是在类中这样定义的：static{},即是在自由代码块前面用static修饰的
//静态代码块的是在JVM进行类加载时被执行的，且只执行一次。即其执行时间是最早最早的。还在自由代码块之前.
//如果类中包含多个静态代码块，那么将按照"先定义的代码先执行，后定义的代码后执行"。
//注意：1 静态代码块不能存在于任何方法体内。
//2 静态代码块不能直接访问静态实例变量和实例方法，需要通过类的实例对象来访问。
public class StaticCodeBlock {
	static{
		System.out.println("静态代码块--------1-------被执行");
	}
	{
		System.out.println("自由代码块-----1-----被执行");
	}
	static{
		System.out.println("静态代码块--------2-------被执行");
	}
	public StaticCodeBlock(){
		System.out.println("构造函数被执行");
	}
	{
		System.out.println("自由代码块-----2-----被执行");
	}
	public static void main(String[] args) {
		System.out.println(" main 方法中在new对象之前的第一条语句被执行。");
		new StaticCodeBlock();
		new StaticCodeBlock();
	}

}

/*
 *运行结果如下：
 静态代码块--------1-------被执行
静态代码块--------2-------被执行
 main 方法中在new对象之前的第一条语句被执行。
自由代码块-----1-----被执行
自由代码块-----2-----被执行
构造函数被执行
自由代码块-----1-----被执行
自由代码块-----2-----被执行
构造函数被执行
 * */
