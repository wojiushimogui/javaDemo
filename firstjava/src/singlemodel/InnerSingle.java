package singlemodel;

public class InnerSingle {
	private InnerSingle(){
		//do..
	}
	private static class SingleHolder{
		public static InnerSingle innerSingle=new InnerSingle();
	}
	public static InnerSingle getInstance(){
		return SingleHolder.innerSingle;
	}
}
