package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//完成从文件中读取数据的功能
public class InputStreamdemo01 {

	public static void main(String[] args) throws Exception{
		File file=new File("f:"+File.separator+"demo.txt");
		InputStream input=new FileInputStream(file);
		//byte[] b=new byte[1024];
		//int len=input.read(b);
		//System.out.println(new String(b,0,len));
		byte[] b=new byte[(int)file.length()];
		for(int i=0;i<b.length;i++)
			b[i]=(byte)input.read();
		System.out.println(new String(b));
		
	}

}
