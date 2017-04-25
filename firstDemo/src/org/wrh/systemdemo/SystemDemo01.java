package org.wrh.systemdemo;

import java.io.IOException;
import java.io.OutputStream;

public class SystemDemo01 {

	public static void main(String[] args) {
		OutputStream out=System.out;//此时out具有了向屏幕输出的能力
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
