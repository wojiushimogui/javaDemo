package org.wrh.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {

	public static void main(String[] args) {
		File file=new File("f:"+File.separator+"demo.txt");
		try {
			file.createNewFile();//�����ļ�
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
