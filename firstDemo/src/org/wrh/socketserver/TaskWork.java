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
		 * ��ȡ�ͻ��˵�ip��ַ
		 * */
		String ip=socket.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		//����������ȡSocket�����������Կͻ��˷����������ݽ��ж�ȡ
		try{
			InputStream is=socket.getInputStream();
			
			/*
			 *��ȡ����,�� ������д�뵽�ļ���
			 * */
			File dir=new File("d:\\wu");
			if(!dir.exists()){
				dir.mkdirs();
				
			}
			
			File file=new File(dir,ip+".txt");
			/*
			 * ����ڷ������˴��ļ��Ѿ����ڵĴ���취
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
			
			//���ͻ���һ��������Ϣ
			OutputStream os=socket.getOutputStream();
			os.write("�յ�����".getBytes());
			
			//����Ϊ�رո���Ҫ�رյ���Դ
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
