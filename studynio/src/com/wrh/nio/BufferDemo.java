	package com.wrh.nio;
	
	import java.nio.IntBuffer;
	
	public class BufferDemo {
	
		static void main(String[] args) {
			//����һ��buff�ռ�
			int cap = 10;
			IntBuffer buffer = IntBuffer.allocate(cap);
			//��buffer���������
			for(int i=0;i<cap;i++){
				buffer.put(i*i);
			}
			
	//		for(int i=0;i<cap;i++){
	//			System.out.print(buffer.get(i)+" ");
	//		}
			System.out.println("buffer�е��������£�");
			/*
			 * ����˻�����������������Ϊ��ǰλ�ã�Ȼ�󽫵�ǰλ������Ϊ0��
			 * ���û��buffer.flip();��仰����buffer.hasRemaining()��Ϊfalse���������whileѭ����û�����
			 * */ 
			buffer.flip();
			while(buffer.hasRemaining()){
				System.out.print(buffer.get()+" ");
			}
		
		}
	
	}
