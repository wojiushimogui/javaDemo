package org.wrh.outputstreamdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ReaderWriteFileDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0 ;
		int num=111;
		FileOutputStream out=null;
		BufferedReader br=null;
		for(;num<112;num++){
			if(num==110||num==120||(num>124&&num<200)||num==204||num==206||num==211||num==216||num==218||(num>223&&num<228)||num==229){
				continue;
			}
			else{
				File file=new File("f:"+File.separator+"shuju_1"+File.separator+num+".txt");
				File file1=new File("d:"+File.separator+"shuju_1"+File.separator+num+".txt");
				StringBuffer sb=new StringBuffer();
				String line;
				try {
					 br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
					 out=new FileOutputStream(file1);
					// Pattern r=Pattern.compile("(\\s\\s)+");
					try {
						while((line=br.readLine())!=null){
							//System.out.println(" 读取的行数据  "+line);
							count++;
							
							String []str=line.split("\\s+");
//							for(String s:str){
//								System.out.println("分裂后的数据："+s+" ");
//							}
							
								String str1=str[str.length-2].trim()+";";
								sb.append(str1);
							
							
						
						}
						System.out.println("读取的行数："+count);
						count=0;
						System.out.println(num+"------号数据的数据长度为："+sb.substring(8).split(",").length);
						out.write(sb.toString().getBytes());
						out.flush();
						System.out.println("success"+num);
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					try {
						out.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}
		
		
		
			
		}

}


