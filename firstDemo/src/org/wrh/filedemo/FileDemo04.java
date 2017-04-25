package org.wrh.filedemo;
//判断路径是否是文件或者是文件夹
import java.io.File;

public class FileDemo04 {

	public static void main(String[] args) {
		File file1=new File("f:"+File.separator+"demo.txt");
		File file2=new File("f:"+File.separator+"eclipse");
		if(file1.isFile())
			System.out.println(file1+"是文件");
		else System.out.println(file1+"不是文件");
		if(file2.isDirectory())
			System.out.println(file2+"是路径");
		else System.out.println(file2+"不是路径");
		
	}

}
