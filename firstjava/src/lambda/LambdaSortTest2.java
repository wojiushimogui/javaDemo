package lambda;

import java.util.Arrays;
import java.util.Comparator;


public class LambdaSortTest2 {

	public static void main(String[] args) {
		//假设现在有这样一个应用场景：对一个字符串数组进行排序
		
		String[] strArr={"abc","cba","bac"};
		Arrays.sort(strArr,(s1,s2)->s1.compareTo(s2));
		
		System.out.println(Arrays.asList(strArr));

		
	}

}
