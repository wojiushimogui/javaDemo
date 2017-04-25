package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Writedemo01 {

	public static void main(String[] args) throws Exception{
		File file=new File("f:"+File.separator+"demo.txt");
		Writer out=new FileWriter(file);//实例化
		String name="xiaoming\r\n";
		String sex="男难拿我是谁是是 和";
		int age=30;
		out.write(name);
		out.write(sex);
		//out.write(age);//这样的写入int型数据在指定的文件中不显示
		out.write( String.valueOf(age));//这样的写入在指定的文件中可以显示出来
		out.flush();
		//out.close();//若不关闭文件，则在指定的文件中就会缺少一定的内容。这是因为字符流不是直接与文件交互的，它是 通过一个缓冲区
	}

}
