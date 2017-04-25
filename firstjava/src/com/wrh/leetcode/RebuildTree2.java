package com.wrh.leetcode;

public class RebuildTree2 {
	private static boolean canRebuild = true;
	private static int[] postOrder ;
	private static int indexPost = 0;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null||in==null||pre.length!=in.length){
        	return null;
        }
        TreeNode head = rebuildHelper(pre,in,pre.length);
        if(!canRebuild){//�����ؽ�
        	return null;
        }
        return head;
    }

	private TreeNode rebuildHelper(int[] pre, int[] in, int len) {
		if(pre==null||in==null||len<1){
			//canRebuild = false;
			return null;
		}
		int val = pre[0];//���ڵ�
		//������������ҵ�ͷ�����ֵ�λ��
		int index = -1;
		for(int i=0;i<len;i++){
			if(in[i]==val){
				index = i;
				break;
			}
		}
		if(index==-1){//�����������û���ҵ����ڵ㣬��˲����ؽ�
			canRebuild = false;
			return null;
		}
		//������ǰ���ڵ�
		TreeNode head = new TreeNode(val);
		//���ſ�ʼ�������ڵ����������
		//������
		//�Ƚ�������Ŀ���
		int len1 = index ;
		int[] preNew = new int[len1];
		int[] inNew = new int[len1];
		for(int i=0;i<len1;i++){
			preNew[i] = pre[1+i];
			inNew[i] = in[i];
		}
		
		head.left = rebuildHelper(preNew, inNew,len1);
		//����������Ƿ��ܹ��ؽ�
		if(!canRebuild){
			return null;
		}
		//������
		//�Ƚ�������Ŀ���
		int len2 = len-index-1;
		int[] preNew2 = new int[len2];
		int[] inNew2 = new int[len2];
		for(int i=0;i<len2;i++){
			preNew2[i] = pre[index+1+i];
			inNew2[i] = in[index+1+i];
		}
		head.right  = rebuildHelper(preNew2, inNew2,len2);
		return head;
	}
	
	public static void main(String[] args){
		int len = 7;
		int[] pre = {1,2,3,4,5,6,7};
		int[] in = {3,2,4,1,6,5,7};
		postOrder = new int[len];
		RebuildTree2 bt = new RebuildTree2();
		TreeNode head = bt.reConstructBinaryTree(pre,in);
		System.out.println(head.val);
		//�������
		bt.postOrder(head); 
		for(int i=0;i<len;i++){
			System.out.print(postOrder[i]+" ");
		}
	}

	private  void postOrder(TreeNode head) {
		if(head==null){
			return ;
		}
		if(head.left!=null){
			postOrder(head.left);
		}
		if(head.right!=null){
			postOrder(head.right);
		}
		postOrder[indexPost] = head.val;
		indexPost++;
		//System.out.print(head.val+" ");
	}
}
