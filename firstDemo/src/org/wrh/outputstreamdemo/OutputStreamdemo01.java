package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamdemo01 {

	public static void main(String[] args) throws Exception {
		//������ļ���д��
		File file=new File("f:"+File.separator+"demo.txt");
		OutputStream output=new FileOutputStream(file,true);//ʵ����
		String name="wuranghao\r\n";
		String str="���ú�";
		int age=30;
		output.write(name.getBytes());//������ݣ������ǽ��ַ�ת��Ϊbyte���飬Ȼ�������
		output.write(str.getBytes());//�ַ������������ļ��п����������������ļ��в�����ʾ������
		output.write(String.valueOf(age).getBytes());
		output.close();
		
	}

}
