package org.wrh.filedemo;
//功能：文件存在就删除文件，不存在就创建文件
import java.io.File;
import java.io.IOException;

public class FileDemo03 {

	public static void main(String[] args) {
		File file=new File("f:"+File.separator+"demo.txt");
		if(file.exists())
			file.delete();
		else{
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
