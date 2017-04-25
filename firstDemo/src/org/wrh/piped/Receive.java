package org.wrh.piped;

import java.io.IOException;
import java.io.PipedInputStream;

public class Receive implements Runnable {
	private PipedInputStream pis=null;
	
	public Receive(PipedInputStream pis) {
		super();
		this.pis = pis;
	}

	public PipedInputStream getPis() {
		return pis;
	}

	public void setPis(PipedInputStream pis) {
		this.pis = pis;
	}

	@Override
	public void run() {
		//������
		byte[] b=new byte[1024];
		int len=0;
		try {
			 len=this.pis.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����Ϊ��"+new String(b,0,len));
	}

	
}
