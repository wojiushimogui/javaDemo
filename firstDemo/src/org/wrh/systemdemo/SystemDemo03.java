package org.wrh.systemdemo;
//���ܣ�������ɼ��̵����룬���ǻ��յ�byte���鳤�ȵ����ơ�
import java.io.IOException;
import java.io.InputStream;

public class SystemDemo03 {

	public static void main(String[] args) {
		InputStream input=System.in;
		byte[] b=new byte[5];
		int len=0;
		System.out.print("����������:");
		try {
			 len=input.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���������Ϊ��"+new String(b,0,len));
		
		
	}

}
