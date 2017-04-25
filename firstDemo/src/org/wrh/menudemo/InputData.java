package org.wrh.menudemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class InputData {
	private BufferedReader br=null;
	public InputData(){
		br=new BufferedReader(new InputStreamReader(System.in));
	}
	public String getString(String info){//infoΪ�ⲿ�ṩ�Ĵ�ӡ��ʾ��Ϣ
		String str=null;
		System.out.print(info);//��ӡ��ʾ��Ϣ
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	public int getInt(String info,String err){//��ȡint�͵�����
		int temp=0;
		boolean flag=true;
		while(flag){
			String str1=this.getString(info);
			if(str1.matches("\\d+")){
				temp=Integer.parseInt(str1);
				flag=false;
			}	
			else 
				System.out.print(err);
		}
		
		return temp;
		
	}
	public float getFloat(String info,String err){//��ȡfloat�͵�����
		float temp=0.0f;
		boolean flag=true;
		while(flag){
			String str1=this.getString(info);
			if(str1.matches("\\d+.?\\d+")){
				temp=Float.parseFloat(str1);
				flag=false;
			}	
			else 
				System.out.print(err);
		}
		
		return temp;
		
	}
	public Date getData(String info,String err){//��ȡData�͵�����
		Date temp=null;
		boolean flag=true;
		while(flag){
			String str1=this.getString(info);
			if(str1.matches("\\d{4}-\\d{2}-\\d{2}")){
				temp=new Date(str1);
				flag=false;
			}	
			else 
				System.out.print(err);
		}
		
		return temp;
		
	}
	
	
	

}
