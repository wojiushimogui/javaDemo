package lambda;


public class LambdaRunnableTest3 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó���������һ���µ��̣߳���ӡhello,world
		//һ���д��
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
