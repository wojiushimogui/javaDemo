package com.wrh.threadInterrupt;

public class TestThread implements Runnable{
	private static int num=0;
	public static void main(String[] args) {
		Thread t=new Thread(new TestThread());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(num);
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			num++;
		}
	}

}

