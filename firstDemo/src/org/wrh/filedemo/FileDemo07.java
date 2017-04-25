package org.wrh.filedemo;

import java.io.File;

public class FileDemo07 {

	public static void main(String[] args) {
		//创建目录
		File file=new File("f:"+File.separator+"dmeo");
		file.mkdir();//创建目录
		file.delete();//创建目录
	}

}
