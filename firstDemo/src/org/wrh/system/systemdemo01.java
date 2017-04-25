package org.wrh.system;

public class systemdemo01 {
	public static void main(String [] args){
		long  begin=System.currentTimeMillis();
		Person p=new Person("小张",19);
		System.out.println(p);
		p=null;//取消引用
		//System.gc();//强制进行垃圾回收，自动调用Person类中的finalize方法
		//System.out.println(p);//为什么加上了这个输出语句后，上面的垃圾回收为什么没有自动调用finalize方法呀
		Runtime.getRuntime().gc();//与System.gc()方法的功能一样，也是自动调用了Person中的finalize方法
		long  end=System.currentTimeMillis();
		System.out.println("程序运行所用的时间："+(end-begin));
		
	}

}
