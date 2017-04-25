package com.wrh.testsynchronized;

public class SyncClass2 {

	public static void main(String[] args) {
		MyThread4 mt = new MyThread4();
		MyThread4 mt2 = new MyThread4();
		new Thread(mt,"Thread1").start();
		new Thread(mt2,"Thread2").start();
	}

}

class MyThread4 implements Runnable{

	private static final int NUM = 3;
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		if(name.equals("Thread1")){
			synClassMethod();
		}
		else if(name.equals("Thread2")){
			synStaticCodeBlock();
		}
	}
	
	public void synClassMethod(){
		synchronized(MyThread4.class){
			for(int i=0;i<NUM;i++){
				System.out.println(Thread.currentThread().getName()+" running... "+i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void synStaticCodeBlock(){	
		for(int i=0;i<NUM;i++){
			System.out.println(Thread.currentThread().getName()+" running... "+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
	}
	
}
