package org.wrh.filedemo;
//����һ��Ŀ¼����ʾĿ¼�µ����е��ļ���·���������������ļ����µ��ļ�ҲҪ��ʾ����
import java.io.File;

public class FileDemo06 {

	public static void main(String[] args) {
		File file=new File("f:"+File.separator+"eclipse");
		listfile(file);
	}
	
	public static void listfile(File file){
		if(file.isDirectory()){//�ж��Ƿ�ΪĿ¼
			File[] paths=file.listFiles();
			for(int i=0;i<paths.length;i++)
				listfile(paths[i]);//���õݹ�
		}
		else System.out.println(file);
	}
}
