package singlemodel;

public class DCLSingle {
	private DCLSingle(){
		//do..
	}
	private static DCLSingle dclSingle;
	//双重检查实例对象dclSingle是否为空
	public static DCLSingle getInstance(){
		if(dclSingle==null){
			synchronized(DCLSingle.class){
				if(dclSingle==null){
					dclSingle=new DCLSingle();
				}
			}
		}
		return dclSingle;
	}
}
