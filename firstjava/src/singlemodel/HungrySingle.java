package singlemodel;

public class HungrySingle {
	//���캯��˽��
	private HungrySingle(){
		//...
	}
	private static HungrySingle instance=new HungrySingle();
	public static HungrySingle getInstance(){
		return instance;
	} 
}
