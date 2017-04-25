package com.wrh.leetcode;

public class RebuildTree {
	
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length!=in.length){
        	return null;
        }
        TreeNode head = new TreeNode(0);
        boolean canRebuild = rebuildHelper(head,pre,in,pre.length);
        if(!canRebuild){//不能重建
        	return null;
        }
        return head;
    }

	private boolean rebuildHelper(TreeNode head, int[] pre, int[] in, int len) {
		if(pre==null||in==null||len<1){
			return false;
		}
		int val = pre[0];//根节点
		//在中序遍历中找到头结点出现的位置
		int index = -1;
		for(int i=0;i<len;i++){
			if(in[i]==val){
				index = i;
				break;
			}
		}
		if(index==-1){//在中序遍历中没有找到根节点，因此不能重建
			return false;
		}
		//构建当前根节点
		head.val = val;
		head.left = new TreeNode(0);
		head.right = new TreeNode(0);
		//接着开始构建根节点的左右子树
		//左子树
		//先进行数组的拷贝
		int len1 = index ;
		int[] preNew = new int[len1];
		int[] inNew = new int[len1];
		for(int i=0;i<len1;i++){
			preNew[i] = pre[i];
			inNew[i] = in[i];
		}
		
		boolean leftCanRebuild = rebuildHelper(head.left,preNew, inNew,len1);
		if(!leftCanRebuild){
			return false;
		}
		//右子树
		//先进行数组的拷贝
		int len2 = len-index-1;
		int[] preNew2 = new int[len2];
		int[] inNew2 = new int[len2];
		for(int i=0;i<len2;i++){
			preNew2[i] = pre[index+1+i];
			inNew2[i] = in[index+1+i];
		}
		boolean rightCanRebuild = rebuildHelper(head.right,preNew2, inNew2,len2);
		return rightCanRebuild;
	}
	
	public static void main(String[] args){
		TreeNode head = null;
		TestHead(head);
		System.out.println(head.val);
	}

	private static void TestHead(TreeNode head) {
		head = new TreeNode(3);
	}
}
