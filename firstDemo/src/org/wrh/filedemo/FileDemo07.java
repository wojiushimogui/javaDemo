package org.wrh.filedemo;

import java.io.File;

public class FileDemo07 {

	public static void main(String[] args) {
		//����Ŀ¼
		File file=new File("f:"+File.separator+"dmeo");
		file.mkdir();//����Ŀ¼
		file.delete();//����Ŀ¼
	}

}
