package org.wrh.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo08 {

	public static void main(String[] args) {
		//����Ŀ¼
		File file=new File("f:"+File.separator+"dmeo"+File.separator+"demo.txt");
		/*if(file.mkdirs())//ʹ��mkdirsʱ�Ͳ���Ҫ�ȴ�����·��
			System.out.println("�����ɹ�");
		else System.out.println("����ʧ��");*/
		//������mkdir������,Ӧ�ȴ�����Ŀ¼��Ȼ���ٴ���Ŀ¼�µ��ļ�
		file.getParentFile().mkdir();
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
