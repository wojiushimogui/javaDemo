package lambda;


public class LambdaRunnableTest3 {

	public static void main(String[] args) {
		//假设现在有这样一个应用场景：开启一个新的线程，打印hello,world
		//一般的写法
		Runnable r1=new Runnable(){

			@Override
			public void run() {
				System.out.println("hello,world11111");
			}
			
		};
		Runnable r2=()->System.out.println("hello,world2222222");
		
		r1.run();
		r2.run();

		
	}

}
