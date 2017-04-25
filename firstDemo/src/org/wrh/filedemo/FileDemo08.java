package org.wrh.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo08 {

	public static void main(String[] args) {
		//创建目录
		File file=new File("f:"+File.separator+"dmeo"+File.separator+"demo.txt");
		/*if(file.mkdirs())//使用mkdirs时就不需要先创建父路径
			System.out.println("创建成功");
		else System.out.println("创建失败");*/
		//若采用mkdir来创建,应先创建父目录，然后再创建目录下的文件
		file.getParentFile().mkdir();
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
