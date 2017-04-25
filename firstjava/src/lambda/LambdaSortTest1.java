package lambda;

import java.util.Arrays;
import java.util.Comparator;


public class LambdaSortTest1 {

	public static void main(String[] args) {
		//��������������һ��Ӧ�ó�������һ���ַ��������������
		
		String[] strArr={"abc","cba","bac"};
		Arrays.sort(strArr, new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
			
		});
		System.out.println(Arrays.asList(strArr));

		
	}

}
