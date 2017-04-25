package com.wrh.threadInterrupt;

public class TestThread_v1 extends Thread {

	public static void main(String[] args) {
		Thread t=new TestThread_v1();
		Thread t1=new SubThread(t);
		t1.start();//������̻߳��ȳ����߳�t����
		t.start();
		try {
			//main�߳�ֻ�ȴ�1000ms,�������߳��Ƿ�����������ڵȴ�����������ȴ���ǰ������ʱҪ�����߳�t����
			t.join(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main end");
	}

	@Override
	public void run() {
		super.run();
		System.out.println("sub  Thread begin");
		try {
			System.out.println("sub  Thread sleep begin");
			Thread.sleep(800);//����800����
			System.out.println("sub  Thread sleep end");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("subThread end");
	}	
}
class SubThread extends Thread{
	Thread thread;
	public SubThread(Thread t){
		this.thread=t;
	}
	@Override
	public void run() {
		super.run();
		holdThreadLock(thread);
	}
	private void holdThreadLock(Thread thread2) {
		synchronized (thread2) {
			System.out.println("hold Thread lock");
			try {
				Thread.sleep(3000);//����3000����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("release Thread lock");
		}
	}
	
}
