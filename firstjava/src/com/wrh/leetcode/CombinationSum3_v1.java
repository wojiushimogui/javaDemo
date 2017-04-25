package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum3_v1 {
	/*
	 * k个数的和为n
	 * */
    public List<List<Integer>> combinationSum3(int k, int n) {
      	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	combine(res,new ArrayList<Integer>(),1,k,n);
    	return res;
       
    }
	
	private void combine(List<List<Integer>> res, ArrayList<Integer> comb,
			int start, int k, int n) {
		if(comb.size()==k&&n==0){
			List<Integer> list = new ArrayList<Integer>(comb);
			res.add(list);
			return ;
		}		
		if(comb.size()>k||n<1){
			return ;
		}
		for(int i=start;i<=9;i++){
			comb.add(i);
			combine(res,comb,i+1,k,n-i);
			//移除最后加入的那个元素
			comb.remove(comb.size()-1);
		}
	}

	public static void main(String[] args){
		int k=3;
		int n=9;
		CombinationSum3_v1 cs = new CombinationSum3_v1();
		List<List<Integer>> res = cs.combinationSum3(k,n);
		for(List<Integer> list:res){
			for(Integer i:list){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
