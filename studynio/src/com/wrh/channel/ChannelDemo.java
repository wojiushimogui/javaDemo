package com.wrh.channel;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {
	//为简化代码逻辑，直接将异常抛出
	public static void main(String[] args) throws IOException {
		String path = "D:"+File.separator+"data.txt";
		
		RandomAccessFile aFile = new RandomAccessFile(path,"rw");
		FileChannel channel = aFile.getChannel();//得到管道
		//借助一个Buffer来与Channel进行交互
		ByteBuffer buffer = ByteBuffer.allocate(128);
		int readByteLen;
		while((readByteLen=channel.read(buffer))!=-1){
			System.out.println("读取到buffer中的数据长度为："+readByteLen);
			System.out.println("内容如下：");
			buffer.flip();//将Buffer从写模式切换到读模式
			while(buffer.hasRemaining()){
				System.out.print(buffer.get());
			}
			buffer.clear();
			
			System.out.println();//换行
			
		}
		aFile.close();
	}

}
