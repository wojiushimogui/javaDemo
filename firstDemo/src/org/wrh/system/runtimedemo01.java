package org.wrh.system;

public class runtimedemo01 {

	public static void main(String[] args) {
		Runtime run=Runtime.getRuntime();
		System.out.println("�����ڴ�Ϊ��"+run.maxMemory());
		System.out.println("���е��ڴ�Ϊ��"+run.freeMemory());
		System.out.println("�ܵ��ڴ�Ϊ��"+run.totalMemory());
		
	}

}
