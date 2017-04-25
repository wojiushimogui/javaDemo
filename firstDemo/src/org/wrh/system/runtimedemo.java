package org.wrh.system;

import java.io.IOException;

public class runtimedemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("SnippingTool.exe");
		Thread.sleep(2000);
		pro.destroy();
		System.out.println("³ÌÐò½áÊø");
		

	}

}
