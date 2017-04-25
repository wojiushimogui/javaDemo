package com.wrh.readTxt;

import java.io.FileOutputStream;

public class WriteString2Txt {
	public void WriteStringToFile5(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            String s1 = "010101010123";
            StringBuffer sb=new StringBuffer();
        	for(int i=0;i<s1.length();i++){
        		sb.append(s1.charAt(i));
        		sb.append(' ');
        	}
            fos.write(sb.toString().getBytes());
            fos.write("\r\n".getBytes());
            String s2 = "111 1 1 1 0 1 0 1 0 1 2 10";
            fos.write(s2.getBytes());
            fos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	public static void main(String[] args) {
        String filePath = "E:\\link.txt";
        new WriteString2Txt().WriteStringToFile5(filePath);
    }
}
