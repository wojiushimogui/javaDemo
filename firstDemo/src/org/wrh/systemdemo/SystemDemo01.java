package org.wrh.systemdemo;

import java.io.IOException;
import java.io.OutputStream;

public class SystemDemo01 {

	public static void main(String[] args) {
		OutputStream out=System.out;//��ʱout����������Ļ���������
		try {
			out.write("hello".getBytes());
			out.write(String.valueOf(30).getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
