package singlemodel;

public class HungrySingle {
	//构造函数私有
	private HungrySingle(){
		//...
	}
	private static HungrySingle instance=new HungrySingle();
	public static HungrySingle getInstance(){
		return instance;
	} 
}
