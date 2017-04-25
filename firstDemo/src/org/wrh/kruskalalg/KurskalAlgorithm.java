package org.wrh.kruskalalg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.wrh.algorithmdemo.DisjuntSetCircle;
import org.wrh.algorithmdemo.Edge;
import org.wrh.algorithmdemo.Graph;

//kurskal算法的java实现
/*
 * 思路如下：
 * 1)将图中所有边按权重从小到大排序，假设放在集合G当中，结合S放即将构成最小生成树所选的边，刚开始时，结合S为空集
 * 2)逐渐选取权重最小的边，若此边与已经已经选中的边没有构成环，则放进S集合中
 * 3)重复第三步，直至S集合中的边的数量为G中(顶点数-1)
 * */
public class KurskalAlgorithm {

	public static void main(String[] args) {
		/*
		 * 给定边的数量和顶点的数量
		 * */
		int vertices_num=9;
		
		int edges_num=13;
		/*
		 * new一个Graph对象
		 * */
		Graph graph=new Graph(vertices_num,edges_num);
		/*
		 * 新建edges_num个Edge对象
		 * */
		List<Edge> edge=new ArrayList<Edge>();
		edge.add(new Edge(0,1,4));
		edge.add(new Edge(0,7,8));
		edge.add(new Edge(1,7,11));
		edge.add(new Edge(1,2,8));
		edge.add(new Edge(2,3,7));
		edge.add(new Edge(2,8,2));
		edge.add(new Edge(2,5,4));
		edge.add(new Edge(3,4,9));
		edge.add(new Edge(3,5,14));
		edge.add(new Edge(4,5,10));
		edge.add(new Edge(5,6,2));
		edge.add(new Edge(6,7,1));
		edge.add(new Edge(6,8,6));
		
		
		/*
		 * 将边加载到图中
		 * */
		graph.setEdge(edge);//这样就构成了一个4个顶点4条边的图
		/*
		 *定义parent数组来记录每个顶点属于那个集合的"代表元素";
		 * 例如：我们的学生管理系统一般会记录我们的"班长"是谁一样
		 * 
		 * */
		/*
		 * 对图中的边按照权重进行排序，返回该图边的数组
		 * */
		Edge[] arrEdges=graph.sort();
		System.out.println(Arrays.toString(arrEdges));
		
		int parent []=new int[vertices_num];
		
		
		/*
		 * 首先我们将这些集合的代表元素初始化为 -1，表示他们都是单个元素的集合
		 * */
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;
			
		}
		graph=findMST(graph,arrEdges,parent);
		System.out.println("最小生成树为："+graph);
		
	}
	/*
	 * graph:原图
	 * arrEdges:图中所有排序后的边按升序构成的数组
	 * parent:图中个顶点的“代表元素”
	 * */
	private static Graph findMST(Graph graph, Edge[] arrEdges,int parent []) {
		/*
		 * edgesMST用来保存图中最小生成树的所包含的边
		 * */
		List<Edge> edgeList=new ArrayList<Edge>();
		
		
		/*
		 * 将权重最小的边加入到最小生成树中
		 * */
		edgeList.add(arrEdges[0]);
		/*
		 * new一个Graph实例来保存最小生成树
		 * */
		Graph graphMST=new Graph();
		
		/*
		 * for循环限制天条件中的edgeList.size()<graph.getVertices_number()是因为MST中的边的条数等于顶点的个数减一
		 * */
		for(int i=1;i<graph.getEdges_number()&&edgeList.size()<graph.getVertices_number();i++){
			/*
			 * 将这条边加入到最小生成树中进行判断
			 * */
			edgeList.add(arrEdges[i]);
			System.out.println("打印edgeList："+edgeList);
			/*
			 * 值得注意的是：且每次循环都要将parent清零,若不清零，将导致第二次以以后的循环的时候
			 * isCircle函数中的find函数进行第一条边的源节点和目的节点的“代表元素”相等，即因有记忆错判为有环
			 * 
			 * 也可以选择对parent不清零，而解决方法就是，我们每次只传入新的边，然后陪和原来的parent来判断是否构成环，这种方法要更好一点
			 * 具体步骤如下：
			 * 我们借用一个中间图Graph graphTemp=new Graph();graphTemp.setEdge(new ArrayList(arrEdges[i]))；
			 * 然后将下面for循环中的graphMST换成graphTemp即可，如下
			 * if(DisjuntSetCircle.isCycle(graphTemp,parent)){//如果构成环，则去掉刚刚加进来的这条边
			 	System.out.println("第"+i+"次有环");
				edgeList.remove(arrEdges[i]);
				//graphMST.setEdge(edgeList);//不断更新MST中的边的内容
			}
			 * */
			for(int j=0;j<parent.length;j++){
				parent[j]=-1;
				
			}
			
			graphMST.setEdge(edgeList);
			if(DisjuntSetCircle.isCycle(graphMST,parent)){//如果构成环，则去掉刚刚加进来的这条边
				System.out.println("第"+i+"次有环");
				edgeList.remove(arrEdges[i]);
				//graphMST.setEdge(edgeList);//不断更新MST中的边的内容
			}
			
		}
		return  graphMST;
		
	}
	

}
