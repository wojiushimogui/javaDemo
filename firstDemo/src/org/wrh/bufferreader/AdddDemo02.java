package org.wrh.bufferreader;
//��������ӵĵڶ����汾������������Ĳ�������ʱ�����ǳ����ܸ�����ʾ
//��������ʽ�������֤
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdddDemo02 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//�������յ�������
		boolean flag=true;
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�������һ������");
		String str1=null;
		while(flag){
			try {
				str1=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str1.matches("\\d+")){
				i=Integer.parseInt(str1);
				flag=false;
			}
			else 
				System.out.print("�������Ϊ���֣����������룺");
			
		}
		
		flag=true;
		System.out.print("������ڶ�������");
		// str1=null;
		while(flag){
			try {
				str1=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str1.matches("\\d+")){
				j=Integer.parseInt(str1);
				flag=false;
			}
			else 
				System.out.print("�������Ϊ���֣����������룺");
			
		}
		
		System.out.println("�������Ľ�����£�"+i+"+"+j+"="+(i+j));
		
	}

}
