package org.wrh.system;

public class runtimedemo01 {

	public static void main(String[] args) {
		Runtime run=Runtime.getRuntime();
		System.out.println("最大的内存为："+run.maxMemory());
		System.out.println("空闲的内存为："+run.freeMemory());
		System.out.println("总的内存为："+run.totalMemory());
		
	}

}
