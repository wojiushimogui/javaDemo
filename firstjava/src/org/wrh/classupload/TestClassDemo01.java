package org.wrh.classupload;
/*
 * 通过子类引用父类的静态字段，不会导致子类初始化
 * */
public class TestClassDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(SubClass.i);
		//SuperClass s=new SuperClass();
		SubClass s=new SubClass();

	}

}
class SuperClass{
	public static int i=3;
	static{
		System.out.println("SuperClass  init");
	}
}
class SubClass extends SuperClass{
	static{
		System.out.println("SubClass init");
	}
	
}
