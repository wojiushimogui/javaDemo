package org.wrh.piped;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class testPipedStreamDemo {

	public static void main(String[] args) {
		PipedOutputStream pos=new PipedOutputStream();
		PipedInputStream pis=new PipedInputStream();
		try {
			pis.connect(pos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Send send=new Send(pos);
		Receive receive=new Receive(pis);
		new Thread(send).start();
		new Thread(receive).start();
	}

}
