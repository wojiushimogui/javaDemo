package org.wrh.socketserver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {

	public static void main(String[] args) throws Exception {
		//��һ���������ͻ���Socket
		Socket s=new Socket("192.168.1.107",4567);
		//�ڶ�������ȡ��������˷��͵������ļ�
		FileInputStream fis=new FileInputStream("d:\\100.txt");
		//����������ȡSocket�����
		OutputStream os=s.getOutputStream();
		
		byte[] buf=new byte[1024];
		int len;
		while((len=fis.read(buf))!=-1){
			os.write(buf, 0, len);
			
		}
		//ˢ��һ�»�����������
		os.flush();
		//���߷��������ҵ������Ѿ���������
		s.shutdownOutput();
		
		//�����������ص����ݶ�ȡ����
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
