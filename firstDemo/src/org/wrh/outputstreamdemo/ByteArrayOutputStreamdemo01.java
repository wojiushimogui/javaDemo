package org.wrh.outputstreamdemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamdemo01 {

	public static void main(String[] args) {
		String name="���ú�";
		int age=30;
		ByteArrayInputStream input=new ByteArrayInputStream(String.valueOf(age).getBytes());//�������ݵ��ڴ�
		//ByteArrayInputStream input=new ByteArrayInputStream(name.getBytes());//�������ݵ��ڴ�
		ByteArrayOutputStream output=new ByteArrayOutputStream();
		int temp=0;
		while((temp=input.read())!=-1)
		{
			//char c=(char)temp;
			//output.write(c);
			//output.write(Character.toUpperCase(temp));
		output.write(temp);//Ҳ�����
			
		}
		String str=output.toString();
		System.out.println(str);
	}

}
