package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamdemo01 {

	public static void main(String[] args) throws Exception {
		//完成向文件的写入
		File file=new File("f:"+File.separator+"demo.txt");
		OutputStream output=new FileOutputStream(file,true);//实例化
		String name="wuranghao\r\n";
		String str="吴让好";
		int age=30;
		output.write(name.getBytes());//输出数据；首先是将字符转化为byte数组，然后再输出
		output.write(str.getBytes());//字符串都可以在文件中看到，但是数字在文件中不是显示的数字
		output.write(String.valueOf(age).getBytes());
		output.close();
		
	}

}
