package com.wrh.leetcode;

import java.util.Stack;

public class Solution_4 {

	public static void main(String[] args) {
		Solution_4 so=new Solution_4();
		String path="/..";
		System.out.println(so.simplifyPath(path));
		
	}
	public String simplifyPath(String path) {
        if(path==null){
        	return null;
        }
        Stack<String> sk=new Stack<String>();
        String []str=path.split("/");//�õ���str[0]="";
        
        for(int i=0;i<str.length;i++){
        	System.out.println(str[i]+"  "+i);
        	if(str[i].equals("..")){
        		if(!sk.isEmpty()){//����
        			sk.pop();
        		}
        		
        	}
        	else if(str[i].equals(".")||str[i].equals("")){}//ʲô������
        	else {
        		sk.push(str[i]);
        	}
        	
        }
        if(sk.isEmpty()){
        	return "/";
        }
        else{
        	StringBuffer sb=new StringBuffer();
        	while(!sk.isEmpty()){
        		sb.insert(0, "/"+sk.pop());
        	}       	
        	return sb.toString();
        }
    }

}
