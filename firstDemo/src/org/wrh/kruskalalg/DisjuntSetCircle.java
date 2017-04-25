package org.wrh.kruskalalg;

import java.util.ArrayList;
import java.util.List;

public class DisjuntSetCircle {

	
	public static void main(String[] args) {
		/*
		 * 给定边的数量和顶点的数量
		 * */
		int vertices_num=4;
		int edges_num=4;
		/*
		 * new一个Graph对象
		 * */
		Graph graph=new Graph(vertices_num,edges_num);
		/*
		 * 新建edges_num个Edge对象
		 * */
		List<Edge> edge=new ArrayList<Edge>();
		edge.add(new Edge(0,1));
		edge.add(new Edge(1,2));
		edge.add(new Edge(2,3));
		edge.add(new Edge(3,0));
		/*
		 * 将边加载到图中
		 * */
		graph.setEdge(edge);//这样就构成了一个4个顶点4条边的图
		/*
		 *定义parent数组来记录每个顶点属于那个集合的"代表元素";
		 * 例如：我们的学生管理系统一般会记录我们的"班长"是谁一样
		 * 
		 * */
		int parent []=new int[vertices_num];
		/*
		 * 首先我们将这些集合的代表元素初始化为 -1，表示他们都是单个元素的集合
		 * */
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;
			
		}
		/*
		 * 下面来判断这个图中是否有环
		 * */
		if(isCycle(graph,parent)){
			System.out.println("此图有环");
		}
		else{
			System.out.println("此图没有环");
		}
		
		
	}

	private static boolean isCycle(Graph graph,int[] parent) {
		int num=graph.getEdge().size();
		int src_represent;
		int dest_represent;
		for(int i=0;i<num;i++){
			int src=graph.getEdge().get(i).getSrc();//得到边的起始点
		    int dest=graph.getEdge().get(i).getDest();//得到边的终点
			src_represent=find(parent,src);
			dest_represent=find(parent,dest);
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
