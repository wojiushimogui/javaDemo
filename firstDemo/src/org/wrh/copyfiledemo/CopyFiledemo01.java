package org.wrh.copyfiledemo;
//����ļ��ĸ��ƹ���
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiledemo01 {

	public static void main(String[] args) throws Exception {
		File file1=new File("f:"+File.separator+"demo.txt");
		File file2=new File("f:"+File.separator+"demo1.txt");
		InputStream input=null;
		OutputStream output=null;
		input=new FileInputStream(file1);
		output=new FileOutputStream(file2);
		//��ȡ����
		byte[] b=new byte[(int)file1.length()];
		for(int i=0;i<b.length;i++)
		{
			b[i]=(byte)input.read();//��ȡ����
			output.write(b[i]);
			
		}
		
	}

}
