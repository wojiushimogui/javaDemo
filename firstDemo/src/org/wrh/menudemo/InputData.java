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
	public String getString(String info){//info为外部提供的打印提示信息
		String str=null;
		System.out.print(info);//打印提示信息
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return str;
	}
	public int getInt(String info,String err){//获取int型的数据
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
	public float getFloat(String info,String err){//获取float型的数据
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
	public Date getData(String info,String err){//获取Data型的数据
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
