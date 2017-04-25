package org.wrh.randomaccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiledemo01 {

	public static void main(String[] args) throws IOException {
		File file=new File("f:"+File.separator+"demo.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		String name="zhangsan";
		int age=30;
		raf.writeBytes(name);
		raf.writeInt(age);
		
		name="lisi    ";
		age=31;
		raf.writeBytes(name);
		raf.writeInt(age);
		name="wangwu  ";
		age=31;
		raf.writeBytes(name);
		raf.writeInt(age);
		
		
		
		
	}

}
