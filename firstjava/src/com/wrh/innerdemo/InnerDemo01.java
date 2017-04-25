package com.wrh.innerdemo;

public class InnerDemo01 {
	class Bar{
		public void show(){
			//do ..
		}
	}
	public static void main(String[] args) {
		InnerDemo01 innerDemo01=new InnerDemo01();
		Bar bar=innerDemo01.method();
		bar.show();//你觉得num会输出吗？？？？
	}
	public Bar  method(){
		//String str="wuranghao";
		int num=30;
		//局部内部类将输出这个局部变量
		 class innerClass extends Bar{//局部内部类不允许加访问修饰符。
			
			public void show(){
				System.out.println(num);
			}
		}
		return new innerClass();
	}

}
