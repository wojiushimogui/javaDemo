package org.wrh.outputstreamdemo;
//Ҳ����һ�����ַ��Ķ�ȡ
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo02 {

	public static void main(String[] args) throws Exception {
		File file=new File("f:"+File.separator+"demo.txt");
		Reader input=new FileReader(file);
		char []c=new char[(int)file.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)input.read();//Ϊʲôһ��һ����ȡ�ļ��е����ݵ�ʱ���������ô�ģ�����
		}
		System.out.println(new String(c));
		
	
		
		
	}

}
