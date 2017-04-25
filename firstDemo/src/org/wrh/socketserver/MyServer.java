package org.wrh.socketserver;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) throws Exception {
		//第一步：建立服务器端Socket
		ServerSocket ss=new ServerSocket(4567);
		while(true){
			//第二步：获取客户端
			Socket socket=ss.accept();
			/*
			 * 当我们考虑多个客户端访问服务器端的时候，我们就需要考虑多线程的问题
			 * */
			new Thread(new TaskWork(socket)).start();
		}
		
	}

}
