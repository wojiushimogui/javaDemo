package org.wrh.systemdemo;
//���ܣ�SystemDemo03.java������ɼ��̵����룬���ǻ��յ�byte���鳤�ȵ����ơ�
//��������ɼ��̵����뵫�ǽ������յ�byte���鳤�ȵ�����
//��Ȼ���������ĳ��ȿ������⣬���ǵ�����Ϊ����ʱ�����޷���ȷ�Ķ�ȡ�ˡ����������ʹ��BufferedReader�����
import java.io.IOException;
import java.io.InputStream;

public class SystemDemo04 {

	public static void main(String[] args) throws IOException {
		InputStream input=System.in;
		int temp=0;
		System.out.print("���������ݣ�");
		StringBuffer buf=new StringBuffer();
		while((temp=input.read())!=-1){
			char c=(char)temp;
			if(c=='\n')
				break;//�����س��������ѭ��
			buf.append(c);
			
		}
		System.out.println("���������Ϊ��"+buf);
		
		
	}

}
