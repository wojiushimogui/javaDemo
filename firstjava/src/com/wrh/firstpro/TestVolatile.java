package com.wrh.firstpro;

public class TestVolatile {
	 
    public volatile static int count = 0;
 
    public static void inc() {
 
        //�����ӳ�1���룬ʹ�ý������
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
 
        count++;
    }
 
    public static void main(String[] args) {
 
        //ͬʱ����1000���̣߳�ȥ����i++���㣬����ʵ�ʽ��
 
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                	TestVolatile.inc();
                }
            }).start();
        }
 
        //����ÿ�����е�ֵ���п��ܲ�ͬ,����Ϊ1000
        try {
			Thread.sleep(10*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("���н��:Counter.count=" + TestVolatile.count);
    }
}