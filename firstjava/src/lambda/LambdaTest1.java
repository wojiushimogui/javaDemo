package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó�������Ҫ���ַ����б��а�����ÿ���ַ�����ת����ȫСд���ַ���
		List<String> strs=new ArrayList<String>();
		strs.add("AbC");
		strs.add("Wu");
		for(String str:strs){
			System.out.println(str);
		}
	}

}
