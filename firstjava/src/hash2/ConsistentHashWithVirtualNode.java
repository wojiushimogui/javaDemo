package hash2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.CRC32;

public class ConsistentHashWithVirtualNode {
	//��������������ڵ�ڵ�
	List<VirtualServerNode> virtualServerNodes = new ArrayList<VirtualServerNode>();
	//ÿ������ڵ��Ӧ������ڵ�ĸ���
	private final static int VIRTUAL_NUM = 5;
	//��ӷ������ڵ�
	public void addServerNode(String serverName){
		if(serverName==null){
			return;
		}
		for(int i=0;i<VIRTUAL_NUM;i++){
			//������裬����ڵ������Ϊ������������ʽ��serverName+"&&VN"+i���������������ڵ�õ�����ڵ�
			String virtualServerNodeName = serverName+"&&VN"+i;
			long hash = getHash(virtualServerNodeName);
			VirtualServerNode vsNode = new VirtualServerNode(serverName, hash);
			virtualServerNodes.add(vsNode);
		}
		//��virtualServerNodes��������
		Collections.sort(virtualServerNodes,new Comparator<VirtualServerNode>() {

			@Override
			public int compare(VirtualServerNode node1, VirtualServerNode node2) {
				if(node1.getVirtualServerNodeHash()<node2.getVirtualServerNodeHash()){
					return -1;
				}
				return 1;
			}
			
		});		
		
	}
	public long getHash(String serverNodeName) {
		CRC32 crc32 = new CRC32();
		crc32.update(serverNodeName.getBytes());
		return crc32.getValue();
	}
	//ɾ���������ڵ�,��Ҫɾ��������������ڵ��Ӧ����������ڵ�
	public void deleteServerNode(String serverName){
			
		for(int i=0;i<virtualServerNodes.size();i++){
			VirtualServerNode node = virtualServerNodes.get(i);
			
			if(node.getServerNodeName().contains(serverName)){//��������contain���ң�����ͰѸ�����������ڵ��Ӧ������ڵ㶼ɾ����
				virtualServerNodes.remove(node);
				/*
				 * ɾ��Ԫ�غ���Ҫ���±��һ��������Ϊ��ÿ��ɾ��Ԫ�غ�ArrayList�Ὣ���沿�ֵ�Ԫ����������Ųһ��λ��(����copy)��
				 * ���ԣ���һ����Ҫ���ʵ��±껹�ǵ�ǰ�±꣬���Ա���ü�һ���ܰ�����Ԫ�ض������ꡣ
				 * */
				i--;
			}
		}
	}
	//�õ�Ӧ��·�ɵ��Ľ��
	public VirtualServerNode getServerNode(String key){
		//�õ�key��hashֵ
		long hash = getHash(key);
		//��VirtualServerNode���ҵ�����hash����������ĵ��Ǹ�VirtualServerNode
		//����serverNodes���������еģ���ˣ��ҵ��ĵ�һ������hash�ľ���Ŀ��ڵ�
		for(VirtualServerNode node:virtualServerNodes){
			if(node.getVirtualServerNodeHash()>hash){
				return node;
			}
		}
		//���û���ҵ�����˵����key��hashֵ�����з������ڵ��hashֵ������˷�����Сhashֵ���Ǹ�Server�ڵ�
		return virtualServerNodes.get(0);
		
	}
	
	public void printServerNodes(){
		System.out.println("���еķ������ڵ���Ϣ���£�");
		for(VirtualServerNode node:virtualServerNodes){
			System.out.println(node.getServerNodeName()+":"+node.getVirtualServerNodeHash());
		}
	}
	
	public static void main(String[] args){
		ConsistentHashWithVirtualNode ch = new ConsistentHashWithVirtualNode();
		//���һϵ�еķ������ڵ�
		String[] servers = {"192.168.0.0:111", "192.168.0.1:111", "192.168.0.2:111",
				             "192.168.0.3:111", "192.168.0.4:111"};
		for(String server:servers){
			ch.addServerNode(server);
		}
		//��ӡ���һ�·������ڵ�
		ch.printServerNodes();
		
		//��������Ŀͻ��˽ڵ�ᱻ·�ɵ��ĸ��������ڵ�
		String[] nodes = {"127.0.0.1:1111", "221.226.0.1:2222", "10.211.0.1:3333"};
		System.out.println("��ʱ�������ͻ��˵�·��������£�");
		for(String node:nodes){
			VirtualServerNode virtualServerNode = ch.getServerNode(node);
			System.out.println(node+","+ ch.getHash(node)+"------->"+
					virtualServerNode.getServerNodeName()+","+virtualServerNode.getVirtualServerNodeHash());
		}
		
		//�����һ���������ڵ�崻�������Ҫ������ڵ�ӷ�������Ⱥ���Ƴ�
		String deleteNodeName="192.168.0.2:111";
		ch.deleteServerNode(deleteNodeName);
		
		System.out.println("ɾ���ڵ�"+deleteNodeName+"���ٿ���ͬ���Ŀͻ��˵�·����������£�");
		for(String node:nodes){
			VirtualServerNode virtualServerNode = ch.getServerNode(node);
			System.out.println(node+","+ ch.getHash(node)+"------->"+
					virtualServerNode.getServerNodeName()+","+virtualServerNode.getVirtualServerNodeHash());
		}
		
		
	}
}
