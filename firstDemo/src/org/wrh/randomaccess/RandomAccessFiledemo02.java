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
		raf.skipBytes(12);//����12���ֽ�
		//��ȡ�ڶ����˵���Ϣ
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("�ڶ����˵���Ϣ��");
		System.out.println("\t|-����:"+new String(b));
		System.out.println("\t|-����:"+age);
		
		raf.seek(0);//������ʼλ��
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("��һ���˵���Ϣ��");
		System.out.println("\t|-����:"+new String(b));
		System.out.println("\t|-����:"+age);
		
		raf.skipBytes(12);//����12���ֽ�
		//��ȡ�������˵���Ϣ
		for(int i=0;i<8;i++){
			b[i]=raf.readByte();
		}
		age=raf.readInt();
		System.out.println("�������˵���Ϣ��");
		System.out.println("\t|-����:"+new String(b));
		System.out.println("\t|-����:"+age);
		
		
		
		
		
	}

}
