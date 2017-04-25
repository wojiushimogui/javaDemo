package org.wrh.filedemo;
//判断路径是否是文件或者是文件夹，若是文件夹，则显示其下面的所有的文件或文件夹
import java.io.File;

public class FileDemo05 {

	public static void main(String[] args) {
		File file2=new File("f:"+File.separator+"eclipse");
		if(file2.isDirectory()){
			File[] file=file2.listFiles();//返回的是改目录下完整的路径
			String[] path=file2.list();//返回的是改目录下的文件的名称
			for(int i=0;i<file.length;i++)
			{
				System.out.println(file[i]);
			}
			for(int i=0;i<path.length;i++)
			{
				System.out.println(path[i]);
			}
		}
			
	
		
	}

}
