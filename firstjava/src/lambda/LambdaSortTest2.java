package lambda;

import java.util.Arrays;
import java.util.Comparator;


public class LambdaSortTest2 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó�������һ���ַ��������������
		
		String[] strArr={"abc","cba","bac"};
		Arrays.sort(strArr,(s1,s2)->s1.compareTo(s2));
		
		System.out.println(Arrays.asList(strArr));

		
	}

}
