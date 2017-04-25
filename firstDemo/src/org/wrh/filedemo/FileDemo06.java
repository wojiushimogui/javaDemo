package org.wrh.filedemo;
//给定一个目录，显示目录下的所有的文件的路径，包括各个子文件夹下的文件也要显示出来
import java.io.File;

public class FileDemo06 {

	public static void main(String[] args) {
		File file=new File("f:"+File.separator+"eclipse");
		listfile(file);
	}
	
	public static void listfile(File file){
		if(file.isDirectory()){//判断是否为目录
			File[] paths=file.listFiles();
			for(int i=0;i<paths.length;i++)
				listfile(paths[i]);//利用递归
		}
		else System.out.println(file);
	}
}
