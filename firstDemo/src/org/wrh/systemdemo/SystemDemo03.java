package org.wrh.systemdemo;
//功能：可以完成键盘的输入，但是会收到byte数组长度的限制。
import java.io.IOException;
import java.io.InputStream;

public class SystemDemo03 {

	public static void main(String[] args) {
		InputStream input=System.in;
		byte[] b=new byte[5];
		int len=0;
		System.out.print("请输入内容:");
		try {
			 len=input.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("输入的内容为："+new String(b,0,len));
		
		
	}

}
