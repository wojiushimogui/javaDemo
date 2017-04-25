package org.wrh.kruskalalg;

import java.util.ArrayList;
import java.util.List;

public class DisjuntSetCircle {

	
	public static void main(String[] args) {
		/*
		 * �����ߵ������Ͷ��������
		 * */
		int vertices_num=4;
		int edges_num=4;
		/*
		 * newһ��Graph����
		 * */
		Graph graph=new Graph(vertices_num,edges_num);
		/*
		 * �½�edges_num��Edge����
		 * */
		List<Edge> edge=new ArrayList<Edge>();
		edge.add(new Edge(0,1));
		edge.add(new Edge(1,2));
		edge.add(new Edge(2,3));
		edge.add(new Edge(3,0));
		/*
		 * ���߼��ص�ͼ��
		 * */
		graph.setEdge(edge);//�����͹�����һ��4������4���ߵ�ͼ
		/*
		 *����parent��������¼ÿ�����������Ǹ����ϵ�"����Ԫ��";
		 * ���磺���ǵ�ѧ������ϵͳһ����¼���ǵ�"�೤"��˭һ��
		 * 
		 * */
		int parent []=new int[vertices_num];
		/*
		 * �������ǽ���Щ���ϵĴ���Ԫ�س�ʼ��Ϊ -1����ʾ���Ƕ��ǵ���Ԫ�صļ���
		 * */
		for(int i=0;i<parent.length;i++){
			parent[i]=-1;
			
		}
		/*
		 * �������ж����ͼ���Ƿ��л�
		 * */
		if(isCycle(graph,parent)){
			System.out.println("��ͼ�л�");
		}
		else{
			System.out.println("��ͼû�л�");
		}
		
		
	}

	private static boolean isCycle(Graph graph,int[] parent) {
		int num=graph.getEdge().size();
		int src_represent;
		int dest_represent;
		for(int i=0;i<num;i++){
			int src=graph.getEdge().get(i).getSrc();//�õ��ߵ���ʼ��
		    int dest=graph.getEdge().get(i).getDest();//�õ��ߵ��յ�
			src_represent=find(parent,src);
			dest_represent=find(parent,dest);
			if(src_represent==dest_represent){//˵�����ߵ����������Ѿ��������˼����У����ϴ˱�֮�󣬹���"��"
				return true;
			}
			else{//���򣬺ϲ�
				union(parent,src_represent,dest_represent);
				
			}
			
			
		}
		return false;
	}
	/*
	 * �ϲ��������ཻ�ļ���
	 * */
	private static void union(int[] parent, int src, int dest) {
		/*
		 * �����������������ϵĲ�ͬ��"����Ԫ��"����˽����еĵġ�����Ԫ�ء���Ϊ����һ��������ɺϲ�
		 * */
		parent[src]=dest;
	}

	/*
	 * ����Ѱ�Ҷ���X���ڼ��ϵ�"����Ԫ��"
	 * */
	private static int find(int[] parent, int x) {
		/*
		 * �����ж϶���x��"����Ԫ���ǲ��ǵ���-1"��������-1����˵������ʵһ������ļ��ϣ�����������ı�ż��ɣ�
		 * ��������-1����˵���˵���ĳ�������У��������ҵ����Ĵ���Ԫ�صı�ţ���������Ҫ���ϲ���
		 * */
		if(parent[x]==-1){
			return x;
			
		}
		return find(parent,parent[x]);
	}

	

}
