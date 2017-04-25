package com.wrh.channel;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {
	//Ϊ�򻯴����߼���ֱ�ӽ��쳣�׳�
	public static void main(String[] args) throws IOException {
		String path = "D:"+File.separator+"data.txt";
		
		RandomAccessFile aFile = new RandomAccessFile(path,"rw");
		FileChannel channel = aFile.getChannel();//�õ��ܵ�
		//����һ��Buffer����Channel���н���
		ByteBuffer buffer = ByteBuffer.allocate(128);
		int readByteLen;
		while((readByteLen=channel.read(buffer))!=-1){
			System.out.println("��ȡ��buffer�е����ݳ���Ϊ��"+readByteLen);
			System.out.println("�������£�");
			buffer.flip();//��Buffer��дģʽ�л�����ģʽ
			while(buffer.hasRemaining()){
				System.out.print(buffer.get());
			}
			buffer.clear();
			
			System.out.println();//����
			
		}
		aFile.close();
	}

}
