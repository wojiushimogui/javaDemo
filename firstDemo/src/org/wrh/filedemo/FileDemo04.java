package org.wrh.filedemo;
//�ж�·���Ƿ����ļ��������ļ���
import java.io.File;

public class FileDemo04 {

	public static void main(String[] args) {
		File file1=new File("f:"+File.separator+"demo.txt");
		File file2=new File("f:"+File.separator+"eclipse");
		if(file1.isFile())
			System.out.println(file1+"���ļ�");
		else System.out.println(file1+"�����ļ�");
		if(file2.isDirectory())
			System.out.println(file2+"��·��");
		else System.out.println(file2+"����·��");
		
	}

}
