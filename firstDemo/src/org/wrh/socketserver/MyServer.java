package org.wrh.socketserver;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		//��һ����������������Socket
		ServerSocket ss=new ServerSocket(4567);
		while(true){
			//�ڶ�������ȡ�ͻ���
			Socket socket=ss.accept();
			/*
			 * �����ǿ��Ƕ���ͻ��˷��ʷ������˵�ʱ�����Ǿ���Ҫ���Ƕ��̵߳�����
			 * */
			new Thread(new TaskWork(socket)).start();
		}
		
	}

}
