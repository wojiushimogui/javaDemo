package org.wrh.systemdemo;
//功能：SystemDemo03.java可以完成键盘的输入，但是会收到byte数组长度的限制。
//本程序将完成键盘的输入但是将不会收到byte数组长度的限制
//虽然解决了输入的长度可以任意，但是当输入为中文时，就无法正确的读取了。解决方法将使用BufferedReader来解决
import java.io.IOException;
import java.io.InputStream;

public class SystemDemo04 {

	public static void main(String[] args) throws IOException {
		InputStream input=System.in;
		int temp=0;
		System.out.print("请输入内容：");
		StringBuffer buf=new StringBuffer();
		while((temp=input.read())!=-1){
			char c=(char)temp;
			if(c=='\n')
				break;//遇到回车后就跳出循坏
			buf.append(c);
			
		}
		System.out.println("输入的内容为："+buf);
		
		
	}

}
