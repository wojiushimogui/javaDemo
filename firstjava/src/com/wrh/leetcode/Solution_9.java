package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	boolean exist(char[][]board,int x,int y,String word,int start){
		if(start>=word.length())  return true;
		if(x<0||x>=board.length||y<0||y>=board[0].length)  return false;
		if(board[x][y]==word.charAt(start++)){//直到检查到有相同的字符
			char temp=board[x][y];
			board[x][y]='#';//将其进行标记
			//从位置（x,y）继续开始寻找。
			boolean result=exist(board,x-1,y,word,start)||exist(board,x+1,y,word,start)||exist(board,x,y-1,word,start)||exist(board,x,y+1,word,start);
			board[x][y]=temp;//还原
			return result;
		}
		return false;
	}
	public List<String> findWords(char[][] board, String[] words) {
        if(board==null||board.length<1||words.length<1){
        	return null;
        }
        List<String> res=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
        	String word=words[i];
        	boolean flag=true;
        	for(int j=0;j<board.length;j++){
        		for(int k=0;k<board[0].length;k++){
        			if(exist(board,i,j,word,0)){
        				res.add(word);
        				flag=false;
        				break;
        				
        			}
        		}
        		if(!flag){
        			break;
        		}
        	}
        }
		
		return res;
    }

}
