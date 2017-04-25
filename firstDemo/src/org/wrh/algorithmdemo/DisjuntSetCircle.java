package org.wrh.algorithmdemo;

public class DisjuntSetCircle {
	/*
	 * ����true���л��ģ�����false��û�л���
	 * */
	public static boolean isCycle(Graph graph,int[] parent) {
		int num=graph.getEdge().size();
		int src_represent;
		int dest_represent;
		for(int i=0;i<num;i++){
			int src=graph.getEdge().get(i).getSrc();//�õ��ߵ���ʼ��
		    int dest=graph.getEdge().get(i).getDest();//�õ��ߵ��յ�
			src_represent=find(parent,src);
			System.out.println("src="+src);
			dest_represent=find(parent,dest);
			System.out.println("dest="+dest);
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
