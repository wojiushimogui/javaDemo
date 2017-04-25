package com.wrh.threadInterrupt;

public class ThreadInterrupt implements Runnable{

	public static void main(String[] args) {
		//����һ���߳�
		ThreadInterrupt runnable=new ThreadInterrupt();
		Thread t=new Thread(runnable);
		t.start();
		
		try {
			Thread.sleep(5000);//ʹmain�߳���Ϣ�ᣬ�����߳���ʱ�����лᡣ
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�ж����߳�
		System.out.println("main ----�����ж����߳�");
		t.interrupt();
		System.out.println("main-----main�߳����н�������");
	}

	@Override
	public void run() {
		System.out.println("run----���߳���������");
		try {
			Thread.sleep(20000);//���߳���Ϣ20�룬�ȴ�main�߳����ն�
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("run-----���߳�����Ϣ��ʱ���ж�");
			return;//���û��return����ʹ�߳��ж�Ҳ�����������أ������������������Ĵ���
		}
		
		System.out.println("run-------���߳����н���");
		
	}

}
