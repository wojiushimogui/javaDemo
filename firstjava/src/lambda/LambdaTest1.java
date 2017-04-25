package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest1 {

	public static void main(String[] args) {
		//假设现在有这样一个应用场景：需要将字符串列表中包含的每个字符串都转换成全小写的字符串
		List<String> strs=new ArrayList<String>();
		strs.add("AbC");
		strs.add("Wu");
		for(String str:strs){
			System.out.println(str);
		}
	}

}
