package com.wrh.teststaticmethod;

public class Test {

	public static void main(String[] args) {
		Parent p1=new Parent();
		Parent p2=new Parent();
		Son s=new Son();
		System.out.println("p1.i= "+p1.i+";p2.i= "+p2.i+";Son.i="+s.i);
		p1.add();
		System.out.println("p1.i= "+p1.i+";p2.i= "+p2.i+";s.i="+s.i);
		//����˵����Parent�е�static���εı���i��������ģ����ж����ǹ�����һ��i��
		
		//���濴�������Ƿ�Ҳ�ǹ������i�أ��������Լ���һ�������أ���
//		Son s=new Son();
//		System.out.println("s.i="+s.i);
	}

}
