package com.wrh.threadInterrupt;
/*
 * 设定一个守护线程
 * */
public class DaemonThread extends Thread {
	public DaemonThread() {
		super();
		this.setDaemon(true);
		this.start();
	}
	public DaemonThread(ThreadGroup group, String name) {
		super(group, name);
		this.setDaemon(true);
		this.start();
	}

	public static void main(String[] args) {
		ThreadGroup group=new ThreadGroup("thread group-1");
		DaemonThread t=new DaemonThread();
		//DaemonThread t=new DaemonThread(group,"first thread in group-1");
		
		System.out.println(t.isDaemon());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(t.getThreadGroup().getName());
	}

	

}
