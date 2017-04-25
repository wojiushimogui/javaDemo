	package com.wrh.nio;
	
	import java.nio.IntBuffer;
	
	public class BufferDemo {
	
		static void main(String[] args) {
			//开辟一段buff空间
			int cap = 10;
			IntBuffer buffer = IntBuffer.allocate(cap);
			//往buffer中添加数据
			for(int i=0;i<cap;i++){
				buffer.put(i*i);
			}
			
	//		for(int i=0;i<cap;i++){
	//			System.out.print(buffer.get(i)+" ");
	//		}
			System.out.println("buffer中的内容如下：");
			/*
			 * 重设此缓冲区，将限制设置为当前位置，然后将当前位置设置为0，
			 * 如果没有buffer.flip();这句话，则buffer.hasRemaining()就为false，即下面的while循环就没有输出
			 * */ 
			buffer.flip();
			while(buffer.hasRemaining()){
				System.out.print(buffer.get()+" ");
			}
		
		}
	
	}
