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
 * �����Ĺ��ܣ���32��M�������ҳ�һ������������Ժõ�������Բ��õģ��ҳ���Ϊ(?)bit��������Ϊ֡ͷʹ��
 * ˼·��ʹ�û������ڵ�˼�������С�
 * �����������ԺõĶ���Ϊ����1�ĸ�������floor��С��ceiling.
 * ������Բ��õĶ���Ϊ�����С��һ����ֵ���ɡ�����ֵΪ:corrlate
 * */
public class GetMSeq {
	public static int frame=131*2;
	public static int ceiling=131;//��1����������
	public static int floor=1;//��1����������
	public static double corrlate=0.2;//��ص�����
	public static int seqNum=80;
	public static void main(String[] args) throws FileNotFoundException {
		List<String> res=new ArrayList<String>();
		//�Գ���Ϊ244Ϊ��׼��ÿ�δ��ı��ļ��ж�ȡ���ݣ�Ȼ������жϡ�
		File file=new File("G:"+File.separator+"LTE"+File.separator+"mSeq"+File.separator+"data.txt");
		//File file=new File("C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"data.txt");
		InputStream input=null;
		input=new FileInputStream(file);
		byte[] firstSeq=new byte[frame];
		byte[] oneBitSeq=new byte[2];
		StringBuffer sb=new StringBuffer();
		String s=null;
		for(int i=0;i<(file.length()-frame)&&res.size()<seqNum;i++){//�ҵ�seqNum������Ҫ��ľ���ֹ
			System.out.println("���ڻ�ȡ�ı��е�"+i+"�����У������ж����Ƿ����������ǿ������ز�����ԡ�");
			try {
				if(i==0){//��һ�λ�һ���Զ�ȡ����Ϊframe������
					input.read(firstSeq);
					s=new String(firstSeq);
				}
				else{//����һ��֮����������ݶ�ȡ����ֻ���ȡ�������ݣ�����ֻ����һ����Ч������
					input.read(oneBitSeq);
					s=new String(oneBitSeq);
					sb.deleteCharAt(0);//ɾ����һ��Ԫ��
				}												
			} catch (IOException e) {
				e.printStackTrace();
			}
			//��s���в���
			String[]ss=s.split(",");					
			for(String temp:ss){				
				sb.append(temp);
				System.out.println("ss�еľ���,�ֽ��Ľ��"+temp);
			}
//			System.out.println(sb);
//			System.out.println("sb�ĳ���Ϊ��"+sb.length());
			//ͳ��sb��1�ĸ����Ƿ���һ����Χ��
			int count=0;
			for(int j=0;j<sb.length();j++){
				if(sb.charAt(j)=='1'){
					count++;
				}
			}
			System.out.println("��������1�ĸ���Ϊ��"+count);
			if(floor<=count&&count<=ceiling&&sb.length()==frame/2){				
				if(isSatisfy(res,sb,count)){
					res.add(sb.toString());
				}
				//����Ҫ���,�����Ѿ����ڵ����н��л���ء�	
			}
		}
		try {
			input.close();//�ر��ļ�
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//�����д��ĳ���ļ��У������ֱ��������ɡ�
		int index=1;
		for(String str1:res){
			System.out.println("�ҵ��Ľ���е�"+index+"�Ľ��Ϊ:"+str1);
			index++;
		}		
		String path="C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"result_121bit_moveOne_v1_cor_0.2.txt";
		WriteStringToFile5(path,res);
		System.out.println("�������н���");
		
	}

	private static boolean isSatisfy(List<String> res, StringBuffer sb,int countOneInSb) {
		if(res.isEmpty()){
			return true;
		}
		for(String str:res){
			double countSameOneNumInStrAndSb=0;
			double countInStrEqualOne=0;
			for(int k=0;k<str.length();k++){
				if(str.charAt(k)=='1'){
					countInStrEqualOne++;
					if(sb.charAt(k)=='1'){
						countSameOneNumInStrAndSb++;
					}
				}				
			}
			double cor=countSameOneNumInStrAndSb/((countInStrEqualOne+countOneInSb)/2.0);
			if(cor>corrlate){//ֻҪ������һ���Ļ���ش���corrlate����Ϊ���ϸ�
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
