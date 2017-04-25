package org.wrh.printstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamDemo01 {

	public static void main(String[] args) throws Exception{
		File file=new File("f:"+File.separator+"demo.txt");
		//PrintStream out=new PrintStream(new FileOutputStream(file));
		PrintStream out=new PrintStream(file);
		out.append("Œ‚»√∫√");
		out.append("wuranghao");
		out.append('\n');
		out.print("who are you??");
		out.println(333333333);
		out.println(3.9844444444);
		out.println("?.........");
		out.close();
		
	}

}
