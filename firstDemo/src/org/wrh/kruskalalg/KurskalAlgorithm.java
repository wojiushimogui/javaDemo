package org.wrh.kruskalalg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.wrh.algorithmdemo.DisjuntSetCircle;
import org.wrh.algorithmdemo.Edge;
import org.wrh.algorithmdemo.Graph;

//kurskal�㷨��javaʵ��
/*
 * ˼·���£�
 * 1)��ͼ�����б߰�Ȩ�ش�С�������򣬼�����ڼ���G���У����S�ż���������С��������ѡ�ıߣ��տ�ʼʱ�����SΪ�ռ�
 * 2)��ѡȡȨ����С�ıߣ����˱����Ѿ��Ѿ�ѡ�еı�û�й��ɻ�����Ž�S������
 * 3)�ظ���������ֱ��S�����еıߵ�����ΪG��(������-1)
 * */
public class KurskalAlgorithm {

	public static void main(String[] args) {
		/*
		 * �����ߵ������Ͷ��������
		 * */
		int vertices_num=9;
		
		int edges_num=13;
		/*
		 * newһ��Graph����
		 * */
		Graph graph=new Graph(vertices_num,edges_num);
		/*
		 * �½�edges_num��Edge����
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
		 * ���߼��ص�ͼ��
		 * */
		graph.setEdge(edge);//�����͹�����һ��4������4���ߵ�ͼ
		/*
		 *����parent��������¼ÿ�����������Ǹ����ϵ�"����Ԫ��";
		 * ���磺���ǵ�ѧ������ϵͳһ����¼���ǵ�"�೤"��˭һ��
		 * 
		 * */
		/*
		 * ��ͼ�еı߰���Ȩ�ؽ������򣬷��ظ�ͼ�ߵ�����
		 * */
		Edge[] arrEdges=graph.sort();
		System.out.println(Arrays.toString(arrEdges));
		
		int parent []=new int[vertices_num];
		
		
		/*
		 * �������ǽ���Щ���ϵĴ���Ԫ�س�ʼ��Ϊ -1����ʾ���Ƕ��ǵ���Ԫ�صļ���
		 * */
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;
			
		}
		graph=findMST(graph,arrEdges,parent);
		System.out.println("��С������Ϊ��"+graph);
		
	}
	/*
	 * graph:ԭͼ
	 * arrEdges:ͼ�����������ı߰����򹹳ɵ�����
	 * parent:ͼ�и�����ġ�����Ԫ�ء�
	 * */
	private static Graph findMST(Graph graph, Edge[] arrEdges,int parent []) {
		/*
		 * edgesMST��������ͼ����С���������������ı�
		 * */
		List<Edge> edgeList=new ArrayList<Edge>();
		
		
		/*
		 * ��Ȩ����С�ı߼��뵽��С��������
		 * */
		edgeList.add(arrEdges[0]);
		/*
		 * newһ��Graphʵ����������С������
		 * */
		Graph graphMST=new Graph();
		
		/*
		 * forѭ�������������е�edgeList.size()<graph.getVertices_number()����ΪMST�еıߵ��������ڶ���ĸ�����һ
		 * */
		for(int i=1;i<graph.getEdges_number()&&edgeList.size()<graph.getVertices_number();i++){
			/*
			 * �������߼��뵽��С�������н����ж�
			 * */
			edgeList.add(arrEdges[i]);
			System.out.println("��ӡedgeList��"+edgeList);
			/*
			 * ֵ��ע����ǣ���ÿ��ѭ����Ҫ��parent����,�������㣬�����µڶ������Ժ��ѭ����ʱ��
			 * isCircle�����е�find�������е�һ���ߵ�Դ�ڵ��Ŀ�Ľڵ�ġ�����Ԫ�ء���ȣ������м������Ϊ�л�
			 * 
			 * Ҳ����ѡ���parent�����㣬������������ǣ�����ÿ��ֻ�����µıߣ�Ȼ�����ԭ����parent���ж��Ƿ񹹳ɻ������ַ���Ҫ����һ��
			 * ���岽�����£�
			 * ���ǽ���һ���м�ͼGraph graphTemp=new Graph();graphTemp.setEdge(new ArrayList(arrEdges[i]))��
			 * Ȼ������forѭ���е�graphMST����graphTemp���ɣ�����
			 * if(DisjuntSetCircle.isCycle(graphTemp,parent)){//������ɻ�����ȥ���ոռӽ�����������
			 	System.out.println("��"+i+"���л�");
				edgeList.remove(arrEdges[i]);
				//graphMST.setEdge(edgeList);//���ϸ���MST�еıߵ�����
			}
			 * */
			for(int j=0;j<parent.length;j++){
				parent[j]=-1;
				
			}
			
			graphMST.setEdge(edgeList);
			if(DisjuntSetCircle.isCycle(graphMST,parent)){//������ɻ�����ȥ���ոռӽ�����������
				System.out.println("��"+i+"���л�");
				edgeList.remove(arrEdges[i]);
				//graphMST.setEdge(edgeList);//���ϸ���MST�еıߵ�����
			}
			
		}
		return  graphMST;
		
	}
	

}
