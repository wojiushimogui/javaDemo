package lambda;


public class LambdaRunnableTest2 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó���������һ���µ��̣߳���ӡhello,world
		//һ���д��
		new Thread(()->System.out.println("hello,world")).start();

		
	}

}
