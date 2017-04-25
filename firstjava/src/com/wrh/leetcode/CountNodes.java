package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountNodes {
		List<TreeNode> list = new ArrayList<TreeNode>();
	   public int countNodes(TreeNode root) {
		   preOrder(root);
		   return list.size();
	   }
		private void preOrder(TreeNode root) {
			if(root==null){
				return ;
			}
			list.add(root);
			preOrder(root.left);
			preOrder(root.right);
		}
}
