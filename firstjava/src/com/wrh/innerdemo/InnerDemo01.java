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
		bar.show();//�����num������𣿣�����
	}
	public Bar  method(){
		//String str="wuranghao";
		int num=30;
		//�ֲ��ڲ��ཫ�������ֲ�����
		 class innerClass extends Bar{//�ֲ��ڲ��಻����ӷ������η���
			
			public void show(){
				System.out.println(num);
			}
		}
		return new innerClass();
	}

}
