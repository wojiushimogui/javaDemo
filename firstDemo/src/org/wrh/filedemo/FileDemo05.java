package org.wrh.filedemo;
//�ж�·���Ƿ����ļ��������ļ��У������ļ��У�����ʾ����������е��ļ����ļ���
import java.io.File;

public class FileDemo05 {

	public static void main(String[] args) {
		File file2=new File("f:"+File.separator+"eclipse");
		if(file2.isDirectory()){
			File[] file=file2.listFiles();//���ص��Ǹ�Ŀ¼��������·��
			String[] path=file2.list();//���ص��Ǹ�Ŀ¼�µ��ļ�������
			for(int i=0;i<file.length;i++)
			{
				System.out.println(file[i]);
			}
			for(int i=0;i<path.length;i++)
			{
				System.out.println(path[i]);
			}
		}
			
	
		
	}

}
