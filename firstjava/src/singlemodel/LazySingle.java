package singlemodel;

public class LazySingle {
	private LazySingle(){
		//do..
	}
	private static LazySingle lazySingle;
	public static synchronized LazySingle getInstance(){
		if(lazySingle==null){
			lazySingle=new LazySingle();
		}
		return lazySingle;
	}

}
/*
 * 
 * �ŵ㣺�ӳټ�����Դ�����ʸߣ�ֻ�е�����getInstance����ʱ���Ż�ʵ�������󣬵����⵼���˵�һ�μ��ؽ�����
 * ȱ�㣺�����̰߳�ȫ�ģ�������߳�ʱ���ͱ���ͨ��ͬ����synchronization�ؼ��֣�������getInstance����������
 * ������ܻ᷵��LazySingleton��������ͬʵ����
 * ���磬һ���߳����ж�instanceΪnull�󣬻�û���ü������µ�instance��
 * ��һ���̴߳�ʱҲ�жϵ�instanceΪnull�����������̱߳�ᴴ������LazySingletonʵ��
 * */
