package org.wrh.bufferreader;
//��������ӵĵ�һ���汾�����������������������ʱ�����������ӵĹ��ܣ����������ľͲ���
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdddDemo01 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//�������յ�������
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������һ������");
		String str1=null;
		try {
			str1=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i=Integer.parseInt(str1);
		System.out.print("������ڶ�������");
		// str1=null;
		try {
			str1=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j=Integer.parseInt(str1);
		
		System.out.println("�������Ľ�����£�"+i+"+"+j+"="+(i+j));
		
	}

}
