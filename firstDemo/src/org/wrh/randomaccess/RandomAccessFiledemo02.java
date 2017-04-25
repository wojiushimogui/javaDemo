package org.wrh.randomaccess;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFiledemo02 {

	public static void main(String[] args) throws IOException {
		File file=new File("f:"+File.separator+"demo.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		String name=null;
		int age=0;
		byte[] b=new byte[8];
		raf.skipBytes(12);//跳过12个字节
		//读取第二个人的信息
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("第二个人的信息：");
		System.out.println("\t|-姓名:"+new String(b));
		System.out.println("\t|-年龄:"+age);
		
		raf.seek(0);//返回起始位置
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("第一个人的信息：");
		System.out.println("\t|-姓名:"+new String(b));
		System.out.println("\t|-年龄:"+age);
		
		raf.skipBytes(12);//跳过12个字节
		//读取第三个人的信息
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("第三个人的信息：");
		System.out.println("\t|-姓名:"+new String(b));
		System.out.println("\t|-年龄:"+age);
		
		
		
		
		
	}

}
