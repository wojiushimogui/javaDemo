package hash2;

public class VirtualServerNode {
	private String serverNodeName;//�������ָ�������Ӧ����ʵ������������ڵ������
	private long virtualServerNodeHash;
	
	public VirtualServerNode(String serverNodeName, long virtualServerNodeHash) {
		super();
		this.serverNodeName = serverNodeName;
		this.virtualServerNodeHash = virtualServerNodeHash;
	}
	public String getServerNodeName() {
		return serverNodeName;
	}
	public void setServerNodeName(String serverNodeName) {
		this.serverNodeName = serverNodeName;
	}
	public long getVirtualServerNodeHash() {
		return virtualServerNodeHash;
	}
	public void setVirtualServerNodeHash(long virtualServerNodeHash) {
		this.virtualServerNodeHash = virtualServerNodeHash;
	}
	
}
