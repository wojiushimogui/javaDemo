package com.wrh.readTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadTxt_v1 {
	 public static void readTxtFile(String filePath){
	        try {
	                String encoding="GBK";
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
	                    InputStreamReader read = new InputStreamReader(
	                    new FileInputStream(file),encoding);//���ǵ������ʽ
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                        System.out.println(lineTxt);
	                        System.out.println("wuranghao ");
	                    }
	                    read.close();
	        }else{
	            System.out.println("�Ҳ���ָ�����ļ�");
	        }
	        } catch (Exception e) {
	            System.out.println("��ȡ�ļ����ݳ���");
	            e.printStackTrace();
	        }
	     
	    }
	     
	    public static void main(String argv[]){
	        String filePath = "C:\\Users\\Superwcq\\Desktop\\mSeq\\data.txt";
//	      "res/";
	        readTxtFile(filePath);
	    }
	     
	     
}

