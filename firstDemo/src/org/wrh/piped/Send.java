package org.wrh.piped;

import java.io.IOException;
import java.io.PipedOutputStream;

public class Send implements Runnable{
	private PipedOutputStream pos=null;
	
	public Send(PipedOutputStream pos) {
		super();
		this.pos = pos;
	}
	
	public PipedOutputStream getPos() {
		return pos;
	}

	public void setPos(PipedOutputStream pos) {
		this.pos = pos;
	}

	@Override
	public void run() {
		//发送数据
		String str="who are you 中国1234567890";
		try {
			this.pos.write(str.getBytes());//写数据
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
