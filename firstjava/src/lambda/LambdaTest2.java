package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest2 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó�������Ҫ���ַ����б��а�����ÿ���ַ�����ת����ȫСд���ַ���
		List<String> strs=new ArrayList<String>();
		strs.add("AbC");
		strs.add("Wu");
		//ʹ��lambda���ʽ���
//		strs.forEach(str->System.out.println(str));
		strs.forEach(System.out::println);
		
	}

}
