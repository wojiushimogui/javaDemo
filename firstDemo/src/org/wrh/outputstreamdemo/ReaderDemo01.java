package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo01 {

	public static void main(String[] args) throws Exception {
		File file=new File("f:"+File.separator+"demo.txt");
		Reader input=new FileReader(file);
		char []c=new char[1024];
		int len=input.read(c);
		//System.out.println(c);//用此输出为受字符数组大小的影响，出现大量的空格
		System.out.println(new String(c,0,len));
	
		
		
	}

}
