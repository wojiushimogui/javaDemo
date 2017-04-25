package selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {

	//ͨ��ѡ����
	private Selector selector;
	public NIOServer(){
		try {
			selector = Selector.open();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * �������ܣ��������˿�ʼ���������Ƿ��пͻ������ӽ���
	 * */
	private void listen() throws IOException {
		System.out.println("server running....");
		while(true){
			// ��ע���¼�����ʱ���������أ�����÷�����һֱ���� 
			selector.select();
			// ���selector��ѡ�е���ĵ�������ѡ�е���Ϊע����¼� 
			Set<SelectionKey> set = selector.selectedKeys();
			Iterator<SelectionKey> ite = set.iterator();
			while(ite.hasNext()){
				SelectionKey selectionKey = (SelectionKey) ite.next();
				// ɾ����ѡ��key �Է��ظ�����  
                ite.remove(); 
                if(selectionKey.isAcceptable()){//����пͻ������ӽ���
                	//���õ����SelectionKey�����ServerSocketChannel��
                	ServerSocketChannel serverSocketChannel = (ServerSocketChannel)selectionKey.channel();
                	// ��úͿͻ������ӵ�ͨ��
                	SocketChannel socketChannel = serverSocketChannel.accept();
                	System.out.println("�пͻ������ӵ�������������");
                	socketChannel.configureBlocking(false);//����ͨ������Ϊ������
                	//����������ͻ��˷�������
                	socketChannel.write(ByteBuffer.wrap(new String("hello client!").getBytes()));
                	//Ϊ�˽��տͻ��˷��͹��������ݣ���Ҫ����ͨ���󶨵�ѡ�����ϣ���Ϊ��ͨ��ע����¼�  
                	socketChannel.register(selector, SelectionKey.OP_READ);
                }
                else if(selectionKey.isReadable()){//�ͻ��˷������ݹ�����
                	//���õ����SelectionKey�����SocketChannel��
                	SocketChannel socketChannel = (SocketChannel)selectionKey.channel();           
               
                	//���������ڿͻ��˷��͹���������
                	ByteBuffer buf = ByteBuffer.allocate(128);
                	socketChannel.read(buf);
            		byte[] receData = buf.array();
            		String msg = new String(receData).trim();
            		System.out.println("�������Կͻ��˵�����Ϊ��"+msg);
            		buf.clear();
//            		int len = 0;
//                	while((len=socketChannel.read(buf))!=-1){
//               
//                		byte[] receData = buf.array();
//                		String msg = new String(receData).trim();
//                		System.out.println("�������Կͻ��˵�����Ϊ��"+msg);
//                		buf.clear();
//                	}
                	
                	//����������ͻ��˷���"ȷ����Ϣ"
                	
//                	buf.put("�յ���Ϣ!!!".getBytes());
//                	while(buf.hasRemaining()){
//                		socketChannel.write(buf);
//                	}	
                	socketChannel.write(ByteBuffer.wrap(new String("�յ���Ϣ!!!").getBytes()));
                	//buf.clear();
                }
			}
			
		}
		
	}
	/*
	 * �������ܣ���ʼ��serverSocketChannel������ָ���Ķ˿��Ƿ����µ�TCP���ӣ�
	 * ����serverSocketChannelע�ᵽselector��
	 * */
	private void init(int port) {
		try {
			ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
			//serverSocketChannel����ָ���˿�
			serverSocketChannel.socket().bind(new InetSocketAddress(port));
			serverSocketChannel.configureBlocking(false);//����Ϊ������ģʽ
			
			/*
			 * ��serverSocketChannelע�ᵽselector��,��Ϊ��ͨ��ע��selectionKey.OP_ACCEPT�¼�  
			 * ע����¼��󣬵��¼������ʱ��selector.select()�᷵�أ�  ����¼�û�е���selector.select()��һֱ����
			 * */
			serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		NIOServer server = new NIOServer();
		server.init(9999);
		server.listen();
	}

}
