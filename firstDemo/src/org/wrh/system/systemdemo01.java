package org.wrh.system;

public class systemdemo01 {
	public static void main(String [] args){
		long  begin=System.currentTimeMillis();
		Person p=new Person("С��",19);
		System.out.println(p);
		p=null;//ȡ������
		//System.gc();//ǿ�ƽ����������գ��Զ�����Person���е�finalize����
		//System.out.println(p);//Ϊʲô�����������������������������Ϊʲôû���Զ�����finalize����ѽ
		Runtime.getRuntime().gc();//��System.gc()�����Ĺ���һ����Ҳ���Զ�������Person�е�finalize����
		long  end=System.currentTimeMillis();
		System.out.println("�����������õ�ʱ�䣺"+(end-begin));
		
	}

}
