package com.wrh.leetcode;

public class CountNodes_v2 {
	
	public int countNodes(TreeNode root) {
		 if(root == null){
			 return 0;
		 }
		 int leftDepth = leftDepth(root);
		 int rightDepth = rightDepth(root);
		 if(leftDepth == rightDepth){
			 return (1<<leftDepth)-1;
		 }
		 else{//如果不相等，则递归到左右子树的节点数+1.
			 return 1 + countNodes(root.left) + countNodes(root.right);
		 }
	}
	
	public int leftDepth(TreeNode root){
		int depth = 0;
		while(root!=null){
			depth ++;
			root = root.left;
		}
		return depth;
	}
	public int rightDepth(TreeNode root){
		int depth = 0;
		while(root!=null){
			depth ++;
			root = root.right;
		}
		return depth;
	}
		
}
