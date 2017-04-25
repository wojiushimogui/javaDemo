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
 * 优点：延迟加载资源利用率高，只有当调用getInstance函数时，才会实例化对象，但是这导致了第一次加载较慢。
 * 缺点：不是线程安全的；引入多线程时，就必须通过同步（synchronization关键字）来保护getInstance（）方法，
 * 否则可能会返回LazySingleton的两个不同实例。
 * 比如，一个线程在判断instance为null后，还没来得及创建新的instance，
 * 另一个线程此时也判断到instance为null，这样两个线程便会创建两个LazySingleton实例
 * */
