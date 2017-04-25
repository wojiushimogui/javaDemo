package hash2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.zip.CRC32;

public class ConsistentHashWithoutVirtualNode {
	//�����洢�������ڵ����
	List<ServerNode> serverNodes= new ArrayList<ServerNode>();
	
	//��ӷ������ڵ�
	public void addServerNode(String serverNodeName){
		if(serverNodeName==null){
			return;
		}
		//����Hash�㷨������������ڵ��Hashֵ
		long serverNodeHash = getHash(serverNodeName);
		ServerNode serverNode = new ServerNode(serverNodeName,serverNodeHash);
		serverNodes.add(serverNode);
		
		//��serverNodes��������
		Collections.sort(serverNodes,new Comparator<ServerNode>() {

			@Override
			public int compare(ServerNode node1, ServerNode node2) {
				if(node1.getServerNodeHash()<node2.getServerNodeHash()){
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
	//ɾ���������ڵ�
	public void deleteServerNode(String serverName){
		//����������з��������ֲ�һ������ֱ�ӱ��������Ƿ���ͬ����
		int serverNum=serverNodes.size();
		for(int i=0;i<serverNum;i++){
			ServerNode node = serverNodes.get(i);
			if(node.getServerNodeName().equals(serverName)){
				serverNodes.remove(node);
				return;
			}
		}
	}
	//�õ�Ӧ��·�ɵ��Ľ��
	public ServerNode getServerNode(String key){
		//�õ�key��hashֵ
		long hash = getHash(key);
		//��serverNodes���ҵ�����hash����������ĵ��Ǹ�ServerNode
		//����serverNodes���������еģ���ˣ��ҵ��ĵ�һ������hash�ľ���Ŀ��ڵ�
		for(ServerNode node:serverNodes){
			if(node.getServerNodeHash()>hash){
				return node;
			}
		}
		//���û���ҵ�����˵����key��hashֵ�����з������ڵ��hashֵ������˷�����Сhashֵ���Ǹ�Server�ڵ�
		return serverNodes.get(0);
		
	}
	
	public void printServerNodes(){
		System.out.println("���еķ������ڵ���Ϣ���£�");
		for(ServerNode node:serverNodes){
			System.out.println(node.getServerNodeName()+":"+node.getServerNodeHash());
		}
	}
	
	public static void main(String[] args){
		ConsistentHashWithoutVirtualNode ch = new ConsistentHashWithoutVirtualNode();
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
			ServerNode serverNode = ch.getServerNode(node);
			System.out.println(node+","+ ch.getHash(node)+"------->"+
						serverNode.getServerNodeName()+","+serverNode.getServerNodeHash());
		}
		
		//�����һ���������ڵ�崻�������Ҫ������ڵ�ӷ�������Ⱥ���Ƴ�
		String deleteNodeName="192.168.0.0:111";
		ch.deleteServerNode(deleteNodeName);
		
		System.out.println("ɾ���ڵ�"+deleteNodeName+"���ٿ���ͬ���Ŀͻ��˵�·����������£�");
		for(String node:nodes){
			ServerNode serverNode = ch.getServerNode(node);
			System.out.println(node+","+ ch.getHash(node)+"------->"+
						serverNode.getServerNodeName()+","+serverNode.getServerNodeHash());
		}
		
		
	}
}
