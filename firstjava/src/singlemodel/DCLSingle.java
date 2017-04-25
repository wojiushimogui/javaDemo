package singlemodel;

public class DCLSingle {
	private DCLSingle(){
		//do..
	}
	private static DCLSingle dclSingle;
	//˫�ؼ��ʵ������dclSingle�Ƿ�Ϊ��
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
