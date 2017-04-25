package com.wrh.readTxt;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
 * �����Ĺ��ܣ���32��M�������ҳ�һ������������Ժõ�������Բ��õģ��ҳ���Ϊ242bit��������Ϊ֡ͷʹ��
 * ˼·��ʹ�û������ڵ�˼�������С�
 * �����������ԺõĶ���Ϊ����1�ĸ�������64��С��180.
 * ������Բ��õĶ���Ϊ������С��һ����ֵ���ɡ�����ֵΪ:40
 * */
public class ReadTxt {
	public static int frame=121*2;
	public static int ceiling=80;//��1����������
	public static int floor=50;//��1����������
	public static int corrlate=25;//��ص�����
	public static int seqNum=128;
	public static void main(String[] args) throws FileNotFoundException {
		List<String> res=new ArrayList<String>();
		//�Գ���Ϊ244Ϊ��׼��ÿ�δ��ı��ļ��ж�ȡ���ݣ�Ȼ������жϡ�
		File file=new File("C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"data.txt");
		InputStream input=null;
		input=new FileInputStream(file);
		byte[] b=new byte[frame];
		for(int i=0;i<(file.length()/frame)-1&&res.size()<seqNum;i++){//�ҵ�seqNum������Ҫ��ľ���ֹ
			System.out.println("���ڻ�ȡ�ı��е�"+i+"�����У������ж����Ƿ����������ǿ������ز�����ԡ�");
			try {
				input.read(b);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			String s=new String(b);
		//	System.out.println(s);
			//��s���в���
			String[]ss=s.split(",");
			StringBuffer sb=new StringBuffer();
			for(String temp:ss){				
				sb.append(temp);
			}
	//		System.out.println(sb);
	//		System.out.println("sb�ĳ���Ϊ��"+sb.length());
			//ͳ��sb��1�ĸ����Ƿ���һ����Χ��
			int count=0;
			for(int j=0;j<sb.length();j++){
				if(sb.charAt(j)=='1'){
					count++;
				}
			}
			System.out.println("��������1�ĸ���Ϊ��"+count);
			if(floor<=count&&count<=ceiling&&sb.length()==frame/2){				
				if(isSatisfy(res,sb)){
					res.add(sb.toString());
				}
				//����Ҫ���,�����Ѿ����ڵ����н��л���ء�	
			}
		}
		//�����д��ĳ���ļ��У������ֱ��������ɡ�
		int index=1;
		for(String str1:res){
			System.out.println("�ҵ��Ľ���е�"+index+"�Ľ��Ϊ:"+str1);
			index++;
		}		
		String path="C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"result_121bit_v1.txt";
		WriteStringToFile5(path,res);
		System.out.println("�������н���");
		
	}

	private static boolean isSatisfy(List<String> res, StringBuffer sb) {
		if(res.isEmpty()){
			return true;
		}
		for(String str:res){
			int count=0;
			for(int k=0;k<str.length();k++){
				if(str.charAt(k)=='1'&&sb.charAt(k)=='1'){
					count++;
				}
			}
			if(count>corrlate){//ֻҪ������һ���Ļ���ش���corrlate����Ϊ���ϸ�
				return false;
			}
		}
		return true;
	}
	public static void WriteStringToFile5(String filePath,List<String> list) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            for(String s:list){
            	//��"0101010"�������ַ����ÿո�ֿ��洢����matlabʹ��
            	StringBuffer sb=new StringBuffer();
            	for(int i=0;i<s.length();i++){
            		sb.append(s.charAt(i));
            		sb.append(' ');
            	}
            	fos.write(sb.toString().getBytes());
            	fos.write("\r\n".getBytes());
            }
            
            fos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}