package org.wrh.outputstreamdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

public class Writedemo01 {

	public static void main(String[] args) throws Exception{
		File file=new File("f:"+File.separator+"demo.txt");
		Writer out=new FileWriter(file);//ʵ����
		String name="xiaoming\r\n";
		String sex="����������˭���� ��";
		int age=30;
		out.write(name);
		out.write(sex);
		//out.write(age);//������д��int��������ָ�����ļ��в���ʾ
		out.write( String.valueOf(age));//������д����ָ�����ļ��п�����ʾ����
		out.flush();
		//out.close();//�����ر��ļ�������ָ�����ļ��оͻ�ȱ��һ�������ݡ�������Ϊ�ַ�������ֱ�����ļ������ģ����� ͨ��һ��������
	}

}
