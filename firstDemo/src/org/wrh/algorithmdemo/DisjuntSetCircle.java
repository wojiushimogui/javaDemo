package org.wrh.algorithmdemo;

public class DisjuntSetCircle {
	/*
	 * 返回true是有环的，返回false是没有环的
	 * */
	public static boolean isCycle(Graph graph,int[] parent) {
		int num=graph.getEdge().size();
		int src_represent;
		int dest_represent;
		for(int i=0;i<num;i++){
			int src=graph.getEdge().get(i).getSrc();//得到边的起始点
		    int dest=graph.getEdge().get(i).getDest();//得到边的终点
			src_represent=find(parent,src);
			System.out.println("src="+src);
			dest_represent=find(parent,dest);
			System.out.println("dest="+dest);
			if(src_represent==dest_represent){//说明，边的两个顶点已经出现在了集合中，加上此边之后，构成"环"
				return true;
			}
			else{//否则，合并
				union(parent,src_represent,dest_represent);
				
			}
			
			
		}
		return false;
	}
	
	
	/*
	 * 合并两个不相交的集合
	 * */
	private static void union(int[] parent, int src, int dest) {
		/*
		 * 由于两者是两个集合的不同的"代表元素"，因此将其中的的“代表元素”改为另外一个即可完成合并
		 * */
		parent[src]=dest;
	}

	/*
	 * 用来寻找顶点X所在集合的"代表元素"
	 * */
	private static int find(int[] parent, int x) {
		/*
		 * 首先判断顶点x的"代表元素是不是等于-1"，若等于-1，则说明，其实一个顶点的集合，返回自身顶点的标号即可；
		 * 若不等于-1，则说明此点在某个集合中，我们需找到他的代表元素的标号，即我们需要向上查找
		 * */
		if(parent[x]==-1){
			return x;
			
		}
		return find(parent,parent[x]);
	}

	

}
