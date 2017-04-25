package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum3 {
	/*
	 * k�����ĺ�Ϊn
	 * */
    public List<List<Integer>> combinationSum3(int k, int n) {
    	
	   	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(k<1||n<1||(k==1&&n>9)){
    		return res;
    	}
    	else if(k==1&&n<=9){
    		List<Integer> list = new ArrayList<Integer>();
    		list.add(n);
    		res.add(list);
    		return res;
    	}
    	else{
    		for(int i=1;i<=9;i++){
        		List<List<Integer>> tempRes=combinationSum3(k-1,n-i);
        		if(tempRes.size()>0){
        			for(List<Integer> l:tempRes){
        				l.add(i);
        				//�ȼ��l���Ƿ����ظ�����
        				Set<Integer> set = new HashSet<Integer>();
        				set.addAll(l);
        				if(l.size()!=set.size()){
        					continue;
        				}
        				//��l��������
        				Collections.sort(l);
        				//�ȼ��res���Ƿ��Ѿ����ڴ˽��
        				if(!isCombinate(res,l)){
        					res.add(l);
        				}
        			}
        			
        		}
        		
        	}
    		return res;
    	}
		
       
    }
	/*
	 * ֻҪres�д���ĳ��list��l�е�Ԫ��һģһ�����򷵻�true
	 * */
	private boolean isCombinate(List<List<Integer>> res, List<Integer> l) {
		for(List<Integer> list:res){		
			if(list.size()==l.size()){
				int i=0;
				for(;i<l.size();i++){
					if(list.get(i)!=l.get(i)){
						break;
					}
				}
				if(i==l.size()){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		int k=3;
		int n=7;
		CombinationSum3 cs = new CombinationSum3();
		List<List<Integer>> res = cs.combinationSum3(k,n);
		for(List<Integer> list:res){
			for(Integer i:list){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
