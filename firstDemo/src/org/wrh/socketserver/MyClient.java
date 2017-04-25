package org.wrh.socketserver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws Exception {
		//第一步：创建客户端Socket
		Socket s=new Socket("192.168.1.107",4567);
		//第二步：读取向服务器端发送的数据文件
		FileInputStream fis=new FileInputStream("d:\\100.txt");
		//第三步：获取Socket输出流
		OutputStream os=s.getOutputStream();
		
		byte[] buf=new byte[1024];
		int len;
		while((len=fis.read(buf))!=-1){
			os.write(buf, 0, len);
			
		}
		//刷新一下缓冲区的数据
		os.flush();
		//告诉服务器，我的数据已经发送完了
		s.shutdownOutput();
		
		//将服务器返回的数据读取出来
		InputStream is=s.getInputStream();
		byte[] buf_in=new byte[1024];
		int len_in=is.read(buf_in);
		System.out.println(new String(buf_in,0,len_in));
		
		
		fis.close();
		os.close();
		is.close();
		s.close();
		
	}

}
