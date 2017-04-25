package org.wrh.socketserver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TaskWork implements Runnable {
	Socket socket;
	public TaskWork(Socket socket){
		this.socket=socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int count=0;
		/*
		 * 获取客户端的ip地址
		 * */
		String ip=socket.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		//第三步：获取Socket的输入流，对客户端发送来的数据进行读取
		try{
			InputStream is=socket.getInputStream();
			
			/*
			 *读取数据,并 将数据写入到文件中
			 * */
			File dir=new File("d:\\wu");
			if(!dir.exists()){
				dir.mkdirs();
				
			}
			
			File file=new File(dir,ip+".txt");
			/*
			 * 如果在服务器端此文件已经存在的处理办法
			 * */
			if(file.exists()){
				file=new File(dir,ip+"("+(++count)+").txt");
			}
			
			FileOutputStream fos=new FileOutputStream(file);
			

			byte[] buf=new byte[1024];
			int len=0;
			while((len=is.read(buf))!=-1){
				fos.write(buf, 0, len);
				
			}
			fos.flush();
			
			//给客户端一个反馈信息
			OutputStream os=socket.getOutputStream();
			os.write("收到数据".getBytes());
			
			//下面为关闭各种要关闭的资源
			fos.close();
			is.close();
			os.close();
			socket.close();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
