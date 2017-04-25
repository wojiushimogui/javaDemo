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
 * 函数的功能：从32阶M序列中找出一定量的自相关性好但互相关性不好的，且长度为(?)bit的序列作为帧头使用
 * 思路：使用滑动窗口的思想来进行。
 * 在这里，自相关性好的定义为：含1的个数大于floor，小于ceiling.
 * 自相关性不好的定义为：卷积小于一定的值即可。该阈值为:corrlate
 * */
public class GetMSeq {
	public static int frame=131*2;
	public static int ceiling=131;//含1个数的上限
	public static int floor=1;//含1个数的下限
	public static double corrlate=0.2;//相关的上限
	public static int seqNum=80;
	public static void main(String[] args) throws FileNotFoundException {
		List<String> res=new ArrayList<String>();
		//以长度为244为基准，每次从文本文件中读取数据，然后进行判断。
		File file=new File("G:"+File.separator+"LTE"+File.separator+"mSeq"+File.separator+"data.txt");
		//File file=new File("C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"data.txt");
		InputStream input=null;
		input=new FileInputStream(file);
		byte[] firstSeq=new byte[frame];
		byte[] oneBitSeq=new byte[2];
		StringBuffer sb=new StringBuffer();
		String s=null;
		for(int i=0;i<(file.length()-frame)&&res.size()<seqNum;i++){//找到seqNum个符合要求的就终止
			System.out.println("正在获取文本中第"+i+"个序列，并会判断其是否满足自相关强、互相关差等特性。");
			try {
				if(i==0){//第一次会一次性读取长度为frame的数据
					input.read(firstSeq);
					s=new String(firstSeq);
				}
				else{//除第一次之外的所有数据读取，均只会读取两个数据，其中只包括一个有效的数字
					input.read(oneBitSeq);
					s=new String(oneBitSeq);
					sb.deleteCharAt(0);//删除第一个元素
				}												
			} catch (IOException e) {
				e.printStackTrace();
			}
			//对s进行操作
			String[]ss=s.split(",");					
			for(String temp:ss){				
				sb.append(temp);
				System.out.println("ss中的经过,分解后的结果"+temp);
			}
//			System.out.println(sb);
//			System.out.println("sb的长度为："+sb.length());
			//统计sb中1的个数是否在一定范围内
			int count=0;
			for(int j=0;j<sb.length();j++){
				if(sb.charAt(j)=='1'){
					count++;
				}
			}
			System.out.println("此序列中1的个数为："+count);
			if(floor<=count&&count<=ceiling&&sb.length()==frame/2){				
				if(isSatisfy(res,sb,count)){
					res.add(sb.toString());
				}
				//符合要求的,将与已经存在的序列进行互相关。	
			}
		}
		try {
			input.close();//关闭文件
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//将结果写入某个文件中，在这里，直接输出即可。
		int index=1;
		for(String str1:res){
			System.out.println("找到的结果中第"+index+"的结果为:"+str1);
			index++;
		}		
		String path="C:"+File.separator+"Users"+File.separator+"Superwcq"+File.separator+"Desktop"+File.separator+"mSeq"+File.separator+"result_121bit_moveOne_v1_cor_0.2.txt";
		WriteStringToFile5(path,res);
		System.out.println("程序运行结束");
		
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
			if(cor>corrlate){//只要与其中一个的互相关大于corrlate，则为不合格
				return false;
			}
		}
		return true;
	}
	public static void WriteStringToFile5(String filePath,List<String> list) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            for(String s:list){
            	//将"0101010"这样的字符串用空格分开存储，被matlab使用
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
