package lambda;


public class LambdaRunnableTest1 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó���������һ���µ��̣߳���ӡhello,world
		//һ���д��
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("hello,world");
			}
			
		}).start();

		
	}

}
