package org.wrh.classupload;
/*
 * ͨ���������ø���ľ�̬�ֶΣ����ᵼ�������ʼ��
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
