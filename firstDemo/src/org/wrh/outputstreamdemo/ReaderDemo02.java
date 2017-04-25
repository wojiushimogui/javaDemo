package org.wrh.outputstreamdemo;
//也可以一个个字符的读取
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo02 {

	public static void main(String[] args) throws Exception {
		File file=new File("f:"+File.separator+"demo.txt");
		Reader input=new FileReader(file);
		char []c=new char[(int)file.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)input.read();//为什么一个一个读取文件中的数据的时候出现了这么的？？？
		}
		System.out.println(new String(c));
		
	
		
		
	}

}
