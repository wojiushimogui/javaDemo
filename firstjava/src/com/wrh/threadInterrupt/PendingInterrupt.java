package com.wrh.threadInterrupt;

public class PendingInterrupt {
	private static boolean flag;
	public static void main(String[] args) {
		flag=true;
		if(flag){
			Thread.currentThread().interrupt();//中断当前线程
		}
		long curTime=System.currentTimeMillis();
		try {//当前线程休眠20秒
			System.out.println("当前线程即将sleep的前一条语句");
			Thread.sleep(20000);
			System.out.println("程序没有被中断");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("程序被中断");
			return;
		}
		
		System.out.println("程序运行的时间:"+(System.currentTimeMillis()-curTime));
		
	}

}

/*
 * 当falg=false时
 * 输出：   当前线程即将sleep的前一条语句
 * 		程序没有被中断
		程序运行的时间:20000
	当flag=true时
	输出：当前线程即将sleep的前一条语句
		程序被中断
		程序运行的时间:0
 * */
