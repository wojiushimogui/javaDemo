package lambda;


public class LambdaRunnableTest2 {

	public static void main(String[] args) {
		//假设现在有这样一个应用场景：开启一个新的线程，打印hello,world
		//一般的写法
		new Thread(()->System.out.println("hello,world")).start();

		
	}

}
