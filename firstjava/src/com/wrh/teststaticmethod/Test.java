package com.wrh.teststaticmethod;

public class Test {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p2=new Parent();
		Son s=new Son();
		System.out.println("p1.i= "+p1.i+";p2.i= "+p2.i+";Son.i="+s.i);
		p1.add();
		System.out.println("p1.i= "+p1.i+";p2.i= "+p2.i+";s.i="+s.i);
		//以上说明了Parent中的static修饰的变量i是属于类的，所有对象都是共享这一个i。
		
		//下面看看子类是否也是共享这个i呢，还是有自己的一个拷贝呢？？
//		Son s=new Son();
//		System.out.println("s.i="+s.i);
	}

}
