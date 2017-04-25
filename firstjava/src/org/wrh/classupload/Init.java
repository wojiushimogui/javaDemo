package org.wrh.classupload;

interface Init {
	public int value=3;
	

}

 class InitClass implements Init{
	static{
		System.out.println("InitClass init");
	}
}
