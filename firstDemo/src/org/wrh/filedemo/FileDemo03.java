package org.wrh.filedemo;
//���ܣ��ļ����ھ�ɾ���ļ��������ھʹ����ļ�
import java.io.File;
import java.io.IOException;

public class FileDemo03 {

	public static void main(String[] args) {
		File file=new File("f:"+File.separator+"demo.txt");
		if(file.exists())
			file.delete();
		else{
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
